package xyz.skycat.work.asttool;

import org.eclipse.jdt.core.dom.*;
import xyz.skycat.work.asttool.parts.MethodInformation;
import xyz.skycat.work.asttool.parts.PackageInformation;

import static xyz.skycat.work.asttool.L.o;
import static xyz.skycat.work.asttool.L.pl;

/**
 * Created by SS on 2016/06/29.
 */
public class ASTVisitorEx extends ASTVisitor {

    public ParseResult parseResult;

    public ASTVisitorEx(ParseKindEnum parseKind) {
        parseResult = new ParseResult(parseKind);
    }

    @Override
    public void preVisit(ASTNode node) {
//        pl("preVisit", node);
        super.preVisit(node);
    }

    @Override
    public boolean preVisit2(ASTNode node) {
//        pl("preVisit2", node);
        return super.preVisit2(node);
    }

    @Override
    public void postVisit(ASTNode node) {
//        pl("postVisit", node);
        super.postVisit(node);
    }

    @Override
    public boolean visit(AnnotationTypeDeclaration node) {
        pl("visit: AnnotationTypeDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(AnnotationTypeMemberDeclaration node) {
        pl("visit: AnnotationTypeMemberDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(AnonymousClassDeclaration node) {
        pl("visit: AnonymousClassDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ArrayAccess node) {
        pl("visit: ArrayAccess", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ArrayCreation node) {
        pl("visit: ArrayCreation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ArrayInitializer node) {
        pl("visit: ArrayInitializer", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ArrayType node) {
        pl("visit: ArrayType", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(AssertStatement node) {
        pl("visit: AssertStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(Assignment node) {
        pl("visit: Assignment", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(Block node) {
        pl("visit: Block", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(BlockComment node) {
        pl("visit: BlockComment", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(BooleanLiteral node) {
        pl("visit: BooleanLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(BreakStatement node) {
        pl("visit: BreakStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(CastExpression node) {
        pl("visit: CastExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(CatchClause node) {
        pl("visit: CatchClause", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(CharacterLiteral node) {
        pl("visit: CharacterLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ClassInstanceCreation node) {
        pl("visit: ClassInstanceCreation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(CompilationUnit node) {
        pl("visit: CompilationUnit", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ConditionalExpression node) {
        pl("visit: ConditionalExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ConstructorInvocation node) {
        pl("visit: ConstructorInvocation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ContinueStatement node) {
        pl("visit: ContinueStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(CreationReference node) {
        pl("visit: CreationReference", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(Dimension node) {
        pl("visit: Dimension", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(DoStatement node) {
        pl("visit: DoStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(EmptyStatement node) {
        pl("visit: EmptyStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(EnhancedForStatement node) {
        pl("visit: EnhancedForStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(EnumConstantDeclaration node) {
        pl("visit: EnumConstantDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(EnumDeclaration node) {
        pl("visit: EnumDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ExpressionMethodReference node) {
        pl("visit: ExpressionMethodReference", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ExpressionStatement node) {
        pl("visit: ExpressionStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(FieldAccess node) {
        pl("visit: FieldAccess", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(FieldDeclaration node) {
        pl("visit: FieldDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ForStatement node) {
        pl("visit: ForStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(IfStatement node) {
        pl("visit: IfStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ImportDeclaration node) {
        pl("visit: ImportDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(InfixExpression node) {
        pl("visit: InfixExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(Initializer node) {
        pl("visit: Initializer", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(InstanceofExpression node) {
        pl("visit: InstanceofExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(IntersectionType node) {
        pl("visit: IntersectionType", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(Javadoc node) {
        pl("visit: Javadoc", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(LabeledStatement node) {
        pl("visit: LabeledStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(LambdaExpression node) {
        pl("visit: LambdaExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(LineComment node) {
        pl("visit: LineComment", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MarkerAnnotation node) {
        pl("visit: MarkerAnnotation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MemberRef node) {
        pl("visit: MemberRef", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MemberValuePair node) {
//        pl("visit: MemberValuePair", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MethodRef node) {
        pl("visit: MethodRef", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MethodRefParameter node) {
        pl("visit: MethodRefParameter", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        o("●●●●●●●●●● START ●●●●●●●●●●");
        pl("visit: MethodDeclaration [" + node.getName() + "]", null);
        MethodInformation methodInformation = new MethodInformation(node);
        parseResult.methodInformationList.add(methodInformation);
        methodInformation.show();
        return super.visit(node);
    }

    @Override
    public boolean visit(MethodInvocation node) {
        return super.visit(node);
    }

    @Override
    public boolean visit(Modifier node) {
        return super.visit(node);
    }

    @Override
    public boolean visit(NameQualifiedType node) {
        return super.visit(node);
    }

    @Override
    public boolean visit(NormalAnnotation node) {
        return super.visit(node);
    }

    @Override
    public boolean visit(NullLiteral node) {
        pl("visit: NullLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(NumberLiteral node) {
        pl("visit: NumberLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(PackageDeclaration node) {
        pl("visit: PackageDeclaration", node);
        this.parseResult.packageInformation = new PackageInformation(node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ParameterizedType node) {
        pl("visit: ParameterizedType", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ParenthesizedExpression node) {
        pl("visit: ParenthesizedExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(PostfixExpression node) {
        pl("visit: PostfixExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(PrefixExpression node) {
        pl("visit: PrefixExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SingleMemberAnnotation node) {
        pl("visit: SingleMemberAnnotation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SingleVariableDeclaration node) {
        pl("visit: SingleVariableDeclaration", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(StringLiteral node) {
        pl("visit: StringLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SuperConstructorInvocation node) {
        pl("visit: SuperConstructorInvocation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SuperFieldAccess node) {
        pl("visit: SuperFieldAccess", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SuperMethodInvocation node) {
        pl("visit: SuperMethodInvocation", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SuperMethodReference node) {
        pl("visit: SuperMethodReference", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SwitchCase node) {
        pl("visit: SwitchCase", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SwitchStatement node) {
        pl("visit: SwitchStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SynchronizedStatement node) {
        pl("visit: SynchronizedStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TagElement node) {
        pl("visit: TagElement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TextElement node) {
        pl("visit: TextElement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ThisExpression node) {
        pl("visit: ThisExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(ThrowStatement node) {
        pl("visit: ThrowStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TryStatement node) {
        pl("visit: TryStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TypeDeclaration node) {
        pl("visit: TypeDeclaration", node);
        parseResult.classInformation.className = node.getName();
        parseResult.classInformation.superClassType = node.getSuperclassType();
        return super.visit(node);
    }

    @Override
    public boolean visit(TypeDeclarationStatement node) {
        pl("visit: TypeDeclarationStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TypeLiteral node) {
        pl("visit: TypeLiteral", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TypeMethodReference node) {
        pl("visit: TypeMethodReference", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(TypeParameter node) {
        pl("visit: TypeParameter", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(UnionType node) {
        pl("visit: UnionType", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(VariableDeclarationExpression node) {
        pl("visit: VariableDeclarationExpression", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(VariableDeclarationStatement node) {
        pl("visit: VariableDeclarationStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(VariableDeclarationFragment node) {
        pl("visit: VariableDeclarationFragment", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(WhileStatement node) {
        pl("visit: WhileStatement", node);
        return super.visit(node);
    }

    @Override
    public boolean visit(WildcardType node) {
        pl("visit: WildcardType", node);
        return super.visit(node);
    }

    @Override
    public void endVisit(AnnotationTypeDeclaration node) {
//        pl("endVisit: AnnotationTypeDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(AnnotationTypeMemberDeclaration node) {
//        pl("endVisit: AnnotationTypeMemberDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(AnonymousClassDeclaration node) {
//        pl("endVisit: AnonymousClassDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ArrayAccess node) {
//        pl("endVisit: ArrayAccess", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ArrayCreation node) {
//        pl("endVisit: ArrayCreation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ArrayInitializer node) {
//        pl("endVisit: ArrayInitializer", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ArrayType node) {
//        pl("endVisit: ArrayType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(AssertStatement node) {
//        pl("endVisit: AssertStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Assignment node) {
//        pl("endVisit: Assignment", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Block node) {
//        pl("endVisit: Block", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(BlockComment node) {
//        pl("endVisit: BlockComment", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(BooleanLiteral node) {
//        pl("endVisit: BooleanLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(BreakStatement node) {
//        pl("endVisit: BreakStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(CastExpression node) {
//        pl("endVisit: CastExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(CatchClause node) {
//        pl("endVisit: CatchClause", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(CharacterLiteral node) {
//        pl("endVisit: CharacterLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ClassInstanceCreation node) {
//        pl("endVisit: ClassInstanceCreation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(CompilationUnit node) {
//        pl("endVisit: CompilationUnit", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ConditionalExpression node) {
//        pl("endVisit: ConditionalExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ConstructorInvocation node) {
//        pl("endVisit: ConstructorInvocation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ContinueStatement node) {
//        pl("endVisit: ContinueStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(CreationReference node) {
//        pl("endVisit: CreationReference", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(DoStatement node) {
//        pl("endVisit: DoStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(EmptyStatement node) {
//        pl("endVisit: EmptyStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(EnhancedForStatement node) {
//        pl("endVisit: EnhancedForStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(EnumConstantDeclaration node) {
//        pl("endVisit: EnumConstantDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(EnumDeclaration node) {
//        pl("endVisit: EnumDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ExpressionMethodReference node) {
//        pl("endVisit: ExpressionMethodReference", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ExpressionStatement node) {
//        pl("endVisit: ExpressionStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Dimension node) {
//        pl("endVisit: Dimension", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(FieldAccess node) {
//        pl("endVisit: FieldAccess", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(FieldDeclaration node) {
//        pl("endVisit: FieldDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ForStatement node) {
//        pl("endVisit: ForStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(IfStatement node) {
//        pl("endVisit: IfStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ImportDeclaration node) {
//        pl("endVisit: ImportDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(InfixExpression node) {
//        pl("endVisit: InfixExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(InstanceofExpression node) {
//        pl("endVisit: InstanceofExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Initializer node) {
//        pl("endVisit: Initializer", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Javadoc node) {
//        pl("endVisit: Javadoc", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(LabeledStatement node) {
//        pl("endVisit: LabeledStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(LambdaExpression node) {
//        pl("endVisit: LambdaExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(LineComment node) {
//        pl("endVisit: LineComment", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MarkerAnnotation node) {
//        pl("endVisit: MarkerAnnotation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MemberRef node) {
//        pl("endVisit: MemberRef", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MemberValuePair node) {
//        pl("endVisit: MemberValuePair", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MethodRef node) {
//        pl("endVisit: MethodRef", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MethodRefParameter node) {
//        pl("endVisit: MethodRefParameter", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(MethodDeclaration node) {
//        pl("endVisit: MethodDeclaration", node);
        super.endVisit(node);
        o("●●●●●●●●●●  END  ●●●●●●●●●●");
    }

    @Override
    public void endVisit(MethodInvocation node) {
//        pl("endVisit: MethodInvocation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(Modifier node) {
//        pl("endVisit: Modifier", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(NameQualifiedType node) {
//        pl("endVisit: NameQualifiedType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(NormalAnnotation node) {
//        pl("endVisit: NormalAnnotation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(NullLiteral node) {
//        pl("endVisit: NullLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(NumberLiteral node) {
//        pl("endVisit: NumberLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(PackageDeclaration node) {
//        pl("endVisit: PackageDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ParameterizedType node) {
//        pl("endVisit: ParameterizedType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ParenthesizedExpression node) {
//        pl("endVisit: ParenthesizedExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(PostfixExpression node) {
//        pl("endVisit: PostfixExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(PrefixExpression node) {
//        pl("endVisit: PrefixExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(PrimitiveType node) {
//        pl("endVisit: PrimitiveType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(QualifiedName node) {
//        pl("endVisit: QualifiedName", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(QualifiedType node) {
//        pl("endVisit: QualifiedType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ReturnStatement node) {
//        pl("endVisit: ReturnStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SimpleName node) {
//        pl("endVisit: SimpleName", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SimpleType node) {
//        pl("endVisit: SimpleType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SingleMemberAnnotation node) {
//        pl("endVisit: SingleMemberAnnotation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SingleVariableDeclaration node) {
//        pl("endVisit: SingleVariableDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(StringLiteral node) {
//        pl("endVisit: StringLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SuperConstructorInvocation node) {
//        pl("endVisit: SuperConstructorInvocation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SuperFieldAccess node) {
//        pl("endVisit: SuperFieldAccess", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SuperMethodInvocation node) {
//        pl("endVisit: SuperMethodInvocation", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SuperMethodReference node) {
//        pl("endVisit: SuperMethodReference", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SwitchCase node) {
//        pl("endVisit: SwitchCase", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SwitchStatement node) {
//        pl("endVisit: SwitchStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(SynchronizedStatement node) {
//        pl("endVisit: SynchronizedStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TagElement node) {
//        pl("endVisit: TagElement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TextElement node) {
//        pl("endVisit: TextElement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ThisExpression node) {
//        pl("endVisit: ThisExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(ThrowStatement node) {
//        pl("endVisit: ThrowStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TryStatement node) {
//        pl("endVisit: TryStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TypeDeclaration node) {
//        pl("endVisit: TypeDeclaration", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TypeDeclarationStatement node) {
//        pl("endVisit: TypeDeclarationStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TypeLiteral node) {
//        pl("endVisit: TypeLiteral", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TypeMethodReference node) {
//        pl("endVisit: TypeMethodReference", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(TypeParameter node) {
//        pl("endVisit: TypeParameter", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(UnionType node) {
//        pl("endVisit: UnionType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(IntersectionType node) {
//        pl("endVisit: IntersectionType", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(VariableDeclarationExpression node) {
//        pl("endVisit: VariableDeclarationExpression", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(VariableDeclarationStatement node) {
//        pl("endVisit: VariableDeclarationStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(VariableDeclarationFragment node) {
//        pl("endVisit: VariableDeclarationFragment", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(WhileStatement node) {
//        pl("endVisit: WhileStatement", node);
        super.endVisit(node);
    }

    @Override
    public void endVisit(WildcardType node) {
//        pl("endVisit: WildcardType", node);
        super.endVisit(node);
    }

}
