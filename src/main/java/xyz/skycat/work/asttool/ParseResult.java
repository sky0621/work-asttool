package xyz.skycat.work.asttool;

import xyz.skycat.work.asttool.parts.ClassInformation;
import xyz.skycat.work.asttool.parts.MethodInformation;
import xyz.skycat.work.asttool.parts.PackageInformation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/04.
 */
public class ParseResult {

    public ParseKindEnum parseKind;

    public PackageInformation packageInformation = null;

    public ClassInformation classInformation = null;

    public List<MethodInformation> methodInformationList = null;

    public ParseResult(ParseKindEnum parseKind) {
        this.parseKind = parseKind;
        methodInformationList = new ArrayList<>();
    }

}
