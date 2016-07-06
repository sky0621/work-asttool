package xyz.skycat.work.asttool.facade.astnode;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 * Created by SS on 2016/07/06.
 */
public class CompilationUnitWrapper implements IfCompilationUnitWrapper {

    private CompilationUnit compilationUnit;

    public CompilationUnitWrapper(ASTNode astNode) {
        if (astNode instanceof CompilationUnit) {
            compilationUnit = (CompilationUnit) astNode;
        }
    }

    @Override
    public CompilationUnit get() {

        return compilationUnit;
    }

}
