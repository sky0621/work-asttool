package xyz.skycat.work.asttool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import xyz.skycat.work.asttool.parser.ActionSourceParser;
import xyz.skycat.work.asttool.parts.ClassInformation;
import xyz.skycat.work.asttool.parts.PackageInformation;
import xyz.skycat.work.asttool.sourcevisitor.ActionSourceVisitor;

/**
 * Created by SS on 2016/06/10.
 */
public class Executor {

    public void run(Path targetPath) {

        ActionSourceVisitor actionSourceVisitor = new ActionSourceVisitor();
        try {
            Files.walkFileTree(targetPath, actionSourceVisitor);
        } catch (IOException e) {
            // TODO error handling.
            System.out.println(e.getMessage());
            return;
        }

        SourceFileVisitor visitor = new SourceFileVisitor();
        visitor.setIfAstMakeFacade(new ActionSourceParser());
        try {
            Files.walkFileTree(targetPath, visitor);
        } catch (IOException e) {
            // TODO error handling.
            System.out.println(e.getMessage());
            return;
        }

        ParseResultAggregator parseResultAggregator = visitor.parseResultAggregator;

        System.out.println("[PACKAGE]\t[CLASS]\t[SUPER CLASS]\t[METHOD VAR]\t[METHOD DO]");
        parseResultAggregator.parseResultMap.values().stream().forEach(parseResults -> {
            parseResults.stream().forEach(parseResult -> {
                PackageInformation pkgInfo = parseResult.packageInformation;
                ClassInformation classInfo = parseResult.classInformation;
                parseResult.methodInformationList.stream().forEach(methodInfo -> {
                    if (methodInfo.fragmentInformationList.isEmpty()) {
                        System.out.println(String.format(
                                "%s\t%s\t%s\t%s\t%s\t%s",
                                pkgInfo.packageNameStr(),
                                classInfo.classNameStr(),
                                classInfo.superClassName(),
                                methodInfo.methodNameStr(),
                                "",
                                ""));
                    }
                    methodInfo.fragmentInformationList.forEach(serviceLayer -> {
                        System.out.println(String.format(
                                "%s\t%s\t%s\t%s\t%s\t%s",
                                pkgInfo.packageNameStr(),
                                classInfo.classNameStr(),
                                classInfo.superClassName(),
                                methodInfo.methodNameStr(),
                                serviceLayer.caller,
                                serviceLayer.callee));
                    });
                });
            });
        });
    }

}
