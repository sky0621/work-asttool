package xyz.skycat.work.asttool;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import xyz.skycat.work.asttool.result.ParseResult;
import xyz.skycat.work.asttool.result.block.ClassInformation;
import xyz.skycat.work.asttool.result.block.PackageInformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static xyz.skycat.work.asttool.L.o;
import static xyz.skycat.work.asttool.L.pl;

/**
 * Created by SS on 2016/06/29.
 */
public class Main {

    public static void main(String... args) {
        pl("<<<<< START >>>>>");
        Path path = Paths.get(args[0]);
        pl("<<<<< " + path.getFileName());
        StringBuilder sb = new StringBuilder();
        try {
            List<String> allStrings = Files.readAllLines(path);
            allStrings.stream().forEach(line -> sb.append(line).append(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String source = sb.toString();
        ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setSource(source.toCharArray());
        ASTNode astNode = parser.createAST(new NullProgressMonitor());
        if (astNode instanceof CompilationUnit) {
            CompilationUnit unit = (CompilationUnit) astNode;
            ParseResult res = new ParseResult();
            ASTVisitorEx visitor = new ASTVisitorEx(res);
            unit.accept(visitor);
            ParseResult res2 = visitor.getParseResult();
            PackageInformation pkgInfo = res2.packageInformation;
            ClassInformation classInfo = res2.classInformation;


            pl("[PACKAGE]\t[CLASS]\t[METHOD]");
            res2.methodInformationList.stream().filter(methodInfo -> methodInfo.isExecute).forEach(methodInfo -> {
                o(String.format("%s\t%s\t%s", pkgInfo.packageNameStr(), classInfo.classNameStr(), methodInfo.methodNameStr()));
            });
        }
        pl("<<<<<  END  >>>>>");
    }

}
