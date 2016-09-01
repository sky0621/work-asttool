package xyz.skycat.work.asttool.astvisitor;

import org.eclipse.jdt.core.dom.ASTVisitor;
import xyz.skycat.work.asttool.ParseKindEnum;
import xyz.skycat.work.asttool.parseresult.IfParseResult;

/**
 * Created by SS on 2016/09/02.
 */
public abstract class ASTParseVisitor<RES extends IfParseResult> extends ASTVisitor {

    public abstract void setParseKind(ParseKindEnum parseKind);

    public abstract RES getParseResult();

}
