package xyz.skycat.work.asttool.parts;

import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Type;

/**
 * Created by SS on 2016/07/04.
 */
public class ClassInformation {

    public SimpleName className;

    public String classNameStr() {
        return className == null ? null : className.getFullyQualifiedName();
    }

    public Type superClassType;

}
