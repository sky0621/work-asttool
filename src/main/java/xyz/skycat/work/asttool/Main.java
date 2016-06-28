package xyz.skycat.work.asttool;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/06/29.
 */
public class Main {

    public static void main(String... args) {
        Path path = Paths.get(args[0]);
        StringBuilder sb = new StringBuilder();
        try {
            List<String> allStrings = Files.readAllLines(path);
            allStrings.stream().forEach( line -> sb.append(line).append(System.lineSeparator()) );
        } catch (IOException e) {
            e.printStackTrace();
        }
        String source = sb.toString();
        ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setSource(source.toCharArray());
        ASTNode astNode = parser.createAST(new NullProgressMonitor());
        if(astNode instanceof CompilationUnit) {
            CompilationUnit unit = (CompilationUnit)astNode;
            ASTVisitor visitor = new ASTVisitorEx();
            PackageDeclaration pd = unit.getPackage();
            IJavaElement je = unit.getJavaElement();
            ITypeRoot tr = unit.getTypeRoot();
            ASTNode root = unit.getRoot();
            Map pp = unit.properties();
            unit.accept(visitor);
        }
        System.out.println("End");
    }

}
