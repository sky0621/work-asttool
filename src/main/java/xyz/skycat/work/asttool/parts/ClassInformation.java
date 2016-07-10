package xyz.skycat.work.asttool.parts;

import org.eclipse.jdt.core.dom.*;

import java.util.List;

/**
 * Created by SS on 2016/07/04.
 */
public class ClassInformation implements IfInformation {

    public SimpleName className;

    public String classNameStr() {
        return className == null ? NO_NAME : className.getFullyQualifiedName();
    }

    public Type superClassType;

    public String superClassName() {
        return superClassType == null ? NO_NAME : superClassType.toString();
    }

    public ASTNode parent;

    public StructuralPropertyDescriptor locationInParent;

    public List<MethodDeclaration> methodDeclarationList;

    public ClassInformation(TypeDeclaration node) {
        this.className = node.getName();
        this.superClassType = node.getSuperclassType();
        this.parent = node.getParent();
        this.locationInParent = node.getLocationInParent();
    }

}
