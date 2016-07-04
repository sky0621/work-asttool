package xyz.skycat.work.asttool.result.block;

import org.eclipse.jdt.core.dom.*;

import java.util.List;

import static xyz.skycat.work.asttool.L.o;

/**
 * Created by SS on 2016/07/04.
 */
public class MethodInformation {

//    public MethodDeclaration methodDeclaration;

    private boolean isRecording = false;

    public MethodInformation() {
        this.isRecording = true;
    }

    public void done() {
        this.isRecording = false;
    }

    public MethodInformation(MethodDeclaration node) {
//        this.methodDeclaration = node;
//        this.methodName = node.getName();
//        this.extraDimensions = node.extraDimensions();
//        this.body = node.getBody();
//        this.receiverQualifier = node.getReceiverQualifier();
//        this.receiverType = node.getReceiverType();
//        this.returnType2 = node.getReturnType2();
//        this.isConstructor = node.isConstructor();
//        this.parameters = node.parameters();
//        this.isVarargs = node.isVarargs();
//        this.resolveBinding = node.resolveBinding();
//        this.thrownExceptionTypes = node.thrownExceptionTypes();
//        this.typeParameters = node.typeParameters();
    }

    public SimpleName methodName;

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

    public Modifier modifier;

    public NameQualifiedType nameQualifiedType;

    public NormalAnnotation normalAnnotation;

    public void show() {
        o("name: " + this.methodName);
        o("returnType2: " + this.returnType2);
        o("receiverType: " + this.receiverType);
        if (this.receiverQualifier != null) {
            o("receiverQualifier: " + this.receiverQualifier.getFullyQualifiedName());
        }
        if (this.extraDimensions != null) {
            o("<extraDimensions>");
            this.extraDimensions.stream().forEach(dimen -> o(dimen.toString()));
        }
        if (this.parameters != null) {
            o("<parameters>");
            this.parameters.stream().forEach(prm -> o(prm.toString()));
        }
        if (this.thrownExceptionTypes != null) {
            o("<thrownExceptionTypes>");
            this.thrownExceptionTypes.stream().forEach(exc -> o(exc.toString()));
        }
        if (this.typeParameters != null) {
            o("<typeParameters>");
            this.typeParameters.stream().forEach(tp -> o(tp.toString()));
        }
        if (methodInvocation != null) {
            o("methodInvocation: " + methodInvocation.getName());
        }
        if (modifier != null) {
            o("modifier: " + modifier.toString());
        }
        if (nameQualifiedType != null) {
            o("nameQualifiedType: " + nameQualifiedType.getName());
        }
        if (normalAnnotation != null) {
            o("normalAnnotation: " + normalAnnotation.toString());
        }
    }

}
