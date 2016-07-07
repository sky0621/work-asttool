package xyz.skycat.work.asttool.parts;

import org.eclipse.jdt.core.dom.*;

import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/07/07.
 */
public class FragmentInformation {

    public VariableDeclarationFragment variableDeclarationFragment;

    public SimpleName fragmentName;

    public String fragmentNameStr() {
        return fragmentName == null ? null : fragmentName.getFullyQualifiedName();
    }

    public Map properties;

    public AST ast;

    public List structuralPropertiesForType;

    public List extraDimensions;

    public ChildListPropertyDescriptor extraDimensions2Property;

    public Expression initializer;

    public ChildPropertyDescriptor initializerProperty;

    public ChildPropertyDescriptor nameProperty;

    public String callMethodStr;

    public String caller;

    public String callee;

    public FragmentInformation(VariableDeclarationFragment fragment) {
        this.variableDeclarationFragment = fragment;
        this.fragmentName = fragment.getName();
        this.properties = fragment.properties();
        this.ast = fragment.getAST();
        this.structuralPropertiesForType = fragment.structuralPropertiesForType();
        this.extraDimensions = fragment.extraDimensions();
        this.extraDimensions2Property = fragment.getExtraDimensions2Property();
        this.initializer = fragment.getInitializer();
        this.callMethodStr = this.initializer.toString();
        if (this.callMethodStr != null) {
            int id = this.callMethodStr.indexOf('.');
            if (id > 0) {
                this.caller = this.callMethodStr.substring(0, id);
                this.callee = this.callMethodStr.substring(id + 1);
            }
//            String[] callercallee = this.callMethodStr.split(".", 0);
//            if (callercallee != null && callercallee.length == 2) {
//                this.caller = callercallee[0];
//                this.callee = callercallee[1];
//            }
        }
        this.initializerProperty = fragment.getInitializerProperty();
        this.nameProperty = fragment.getNameProperty();
    }

}
