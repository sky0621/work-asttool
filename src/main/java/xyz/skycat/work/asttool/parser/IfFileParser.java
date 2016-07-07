package xyz.skycat.work.asttool.parser;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import xyz.skycat.work.asttool.ASTVisitorEx;
import xyz.skycat.work.asttool.AstMakeException;
import xyz.skycat.work.asttool.ParseKindEnum;
import xyz.skycat.work.asttool.ParseResult;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by SS on 2016/07/08.
 */
public interface IfFileParser {

    // CoR
    // TemplateMethod

    public default ParseResult parse(Path sourceFilePath) throws AstMakeException {

        if (sourceFilePath == null) {
            return null;
        }

        if (!ParseKindEnum.hasPackageName(sourceFilePath.toString())) {
            return null;
        }

        if (!isTarget(sourceFilePath)) {
            if (getChain() == null) {
                return null;
            }
            return getChain().parse(sourceFilePath);
        }

        StringBuilder sb = new StringBuilder();
        try {
            List<String> allStrings = Files.readAllLines(sourceFilePath);
            allStrings.stream().forEach(line -> sb.append(line).append(System.lineSeparator()));
        } catch (IOException e) {
            // TODO log
            throw new AstMakeException(e);
        }
        String source = sb.toString();

        InputStream sourceInputStream = null;
        try {
            sourceInputStream = Files.newInputStream(sourceFilePath);
        } catch (IOException e) {
            // TODO log
            throw new AstMakeException(e);
        }

        ASTNode astNode = null;
        try {
            ASTParser parser = ASTParser.newParser(AST.JLS8);
            parser.setSource(source.toCharArray());
            astNode = parser.createAST(new NullProgressMonitor());
        } catch (Exception e) {
            // TODO log
            throw new AstMakeException(e);
        }

        ASTVisitorEx visitor = new ASTVisitorEx(getParseKind());
        astNode.accept(visitor);

        return visitor.parseResult;
    }

    boolean isTarget(Path path);

    IfFileParser getChain();

    ParseKindEnum getParseKind();

}
