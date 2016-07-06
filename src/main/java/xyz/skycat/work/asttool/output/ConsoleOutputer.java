package xyz.skycat.work.asttool.output;

import xyz.skycat.work.asttool.result.ParseResult;
import xyz.skycat.work.asttool.result.block.ClassInformation;
import xyz.skycat.work.asttool.result.block.PackageInformation;

import static xyz.skycat.work.asttool.L.pl;

/**
 * Created by SS on 2016/06/15.
 */
public class ConsoleOutputer extends AbstractAstOutputer {

    @Override
    public void output() {

        ParseResult res2 = getParseResult();
        PackageInformation pkgInfo = res2.packageInformation;
        ClassInformation classInfo = res2.classInformation;
        pl("[PACKAGE]\t[CLASS]\t[METHOD]");
//        res2.methodInformationList.stream().filter(methodInfo -> methodInfo.isExecute).forEach(methodInfo -> {
        res2.methodInformationList.stream().forEach(methodInfo -> {
            System.out.println(String.format("%s\t%s\t%s", pkgInfo.packageNameStr(), classInfo.classNameStr(), methodInfo.methodNameStr()));
        });

    }

}
