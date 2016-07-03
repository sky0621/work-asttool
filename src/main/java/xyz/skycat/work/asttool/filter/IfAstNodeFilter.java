package xyz.skycat.work.asttool.filter;

import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Created by SS on 2016/07/04.
 */
public interface IfAstNodeFilter {

    // TODO CoR


    void doFilter(ASTNode astNode, IfAstNodeFilter chain);

}
