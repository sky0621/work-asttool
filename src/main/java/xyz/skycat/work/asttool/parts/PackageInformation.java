package xyz.skycat.work.asttool.parts;

import org.eclipse.jdt.core.dom.*;

import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/07/04.
 */
public class PackageInformation implements IfInformation {

    public PackageDeclaration packageDeclaration;

    public Javadoc javadoc;

    public List annotations;

    public AST ast;

    public Name packageName;

    public String packageNameStr() {
        return packageName == null ? NO_NAME : packageName.getFullyQualifiedName();
    }

    public IPackageBinding resolveBinding;

    public List structuralPropertiesForType;

    public Map properties;

    public PackageInformation(PackageDeclaration node) {
        this.packageDeclaration = node;
        this.javadoc = node.getJavadoc();
        this.annotations = node.annotations();
        this.ast = node.getAST();
        this.packageName = node.getName();
        this.resolveBinding = node.resolveBinding();
        this.structuralPropertiesForType = node.structuralPropertiesForType();
        this.properties = node.properties();
    }

}
