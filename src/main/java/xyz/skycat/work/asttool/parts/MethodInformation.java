package xyz.skycat.work.asttool.parts;

import org.eclipse.jdt.core.dom.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/04.
 */
public class MethodInformation implements IfInformation {

    public MethodDeclaration methodDeclaration;

    public SimpleName methodName;

    public String methodNameStr() {
        return methodName == null ? NO_NAME : methodName.getFullyQualifiedName();
    }

    public List extraDimensions;

    public Block body;

    public SimpleName receiverQualifier;

    public Type receiverType;

    public Type returnType2;

    public boolean isConstructor;

    public List parameters;

    public boolean isVarargs;

    public IMethodBinding resolveBinding;

    public List thrownExceptionTypes;

    public List typeParameters;

    public MethodInvocation methodInvocation;

    public List modifiers;

    public ChildListPropertyDescriptor modifiersProperty;

    public Javadoc javadoc;

    public ChildPropertyDescriptor javadocProperty;

    public AST ast;

    public boolean isExecute = false;

    public List<FragmentInformation> fragmentInformationList;

    public MethodInformation(MethodDeclaration node) {
        this.methodDeclaration = node;
        this.methodName = node.getName();
        this.extraDimensions = node.extraDimensions();
        this.body = node.getBody();
        this.receiverQualifier = node.getReceiverQualifier();
        this.receiverType = node.getReceiverType();
        this.returnType2 = node.getReturnType2();
        this.isConstructor = node.isConstructor();
        this.parameters = node.parameters();
        this.isVarargs = node.isVarargs();
        this.resolveBinding = node.resolveBinding();
        this.thrownExceptionTypes = node.thrownExceptionTypes();
        this.typeParameters = node.typeParameters();
        this.modifiers = node.modifiers();
        this.modifiersProperty = node.getModifiersProperty();
        this.javadoc = node.getJavadoc();
        this.javadocProperty = node.getJavadocProperty();
        this.ast = node.getAST();

        if (this.modifiers != null) {
            for (Object modifier : this.modifiers) {
                if (modifier instanceof NormalAnnotation) {
                    NormalAnnotation annotation = (NormalAnnotation) modifier;
                    Name typeName = annotation.getTypeName();
                    if (typeName != null && "Execute".equals(typeName.getFullyQualifiedName())) {
                        this.isExecute = true;
                    }
                }
            }
        }
        fragmentInformationList = new ArrayList<>();
        if (this.body != null) {
            for (Object statement : this.body.statements()) {
                if (statement instanceof VariableDeclarationStatement) {
                    VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
                    List fragments = variableDeclarationStatement.fragments();
                    if (fragments != null) {
                        for (Object fragment : fragments) {
                            if (fragment instanceof VariableDeclarationFragment) {
                                VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment) fragment;
                                fragmentInformationList.add(new FragmentInformation(variableDeclarationFragment));
                            }
                        }
                    }
                }
            }
        }
    }

}
