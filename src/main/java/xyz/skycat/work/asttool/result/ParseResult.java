package xyz.skycat.work.asttool.result;

import xyz.skycat.work.asttool.result.block.ClassInformation;
import xyz.skycat.work.asttool.result.block.MethodInformation;
import xyz.skycat.work.asttool.result.block.PackageInformation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/04.
 */
public class ParseResult {

    public PackageInformation packageInformation = null;

    public ClassInformation classInformation = null;

    public List<MethodInformation> methodInformationList = null;

    public ParseResult() {
        packageInformation = new PackageInformation();
        classInformation = new ClassInformation();
        methodInformationList = new ArrayList<>();
    }

}
