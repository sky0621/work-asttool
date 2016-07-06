package xyz.skycat.work.asttool;

import xyz.skycat.work.asttool.config.DefaultConfiguration;
import xyz.skycat.work.asttool.config.IfConfiguration;
import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.IfAstMakeFacade;
import xyz.skycat.work.asttool.targetsearch.SourceFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public class Executor {

    IfConfiguration configuration;

    public Executor() {
        configuration = new DefaultConfiguration();
    }

    public Executor(IfConfiguration configuration) {
        this.configuration = configuration;
    }

    public void run(Path targetPath) {

        IfAstMakeFacade facade = null;
        try {
            facade = configuration.buildFacade();

        } catch (AstMakeException e) {
            // TODO error handling.
            System.out.println(e.getMessage());
        }

        SourceFileVisitor visitor = new SourceFileVisitor();
        visitor.setIfAstMakeFacade(facade);
        try {
            Files.walkFileTree(targetPath, visitor);

        } catch (IOException e) {
            // TODO error handling.
            System.out.println(e.getMessage());
        }
    }

}
