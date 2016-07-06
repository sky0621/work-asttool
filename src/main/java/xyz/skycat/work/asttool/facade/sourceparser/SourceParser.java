package xyz.skycat.work.asttool.facade.sourceparser;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.astnode.CompilationUnitWrapper;
import xyz.skycat.work.asttool.facade.astnode.IfCompilationUnitWrapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by SS on 2016/05/27.
 */
public class SourceParser implements IfSourceParser {

    // wrap JSqlParser and Statement.
    @Override
    public IfCompilationUnitWrapper parse(Path sourceFilePath) throws AstMakeException {

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

        return new CompilationUnitWrapper(astNode);
    }

}
