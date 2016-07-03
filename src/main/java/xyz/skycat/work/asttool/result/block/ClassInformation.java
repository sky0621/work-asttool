package xyz.skycat.work.asttool.result.block;

import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Type;
import xyz.skycat.work.asttool.result.ClassTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/04.
 */
public class ClassInformation implements IfClassInformation {

    private ClassTypeEnum type = null;
    List<IfClassInformation> innerClassInformationList = null;

    public SimpleName className;

    public Type superClassType;

    public ClassInformation() {
        innerClassInformationList = new ArrayList<>();
    }

    public ClassInformation(ClassTypeEnum type) {
        this();
        this.type = type;
    }

    @Override
    public ClassTypeEnum getType() {
        return type;
    }

}
