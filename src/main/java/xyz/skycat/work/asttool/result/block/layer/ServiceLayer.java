package xyz.skycat.work.asttool.result.block.layer;

import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

/**
 * Created by SS on 2016/07/06.
 */
public class ServiceLayer {

    public VariableDeclarationFragment fragment;

    public String callName;

    public String callMethodName;

    public ServiceLayer(VariableDeclarationFragment fragment) {
        this.fragment = fragment;
        // FIXME
//        this.callName = xxx;
//        this.callMethodName = xxx;
    }

}
