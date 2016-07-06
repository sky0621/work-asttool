package xyz.skycat.work.asttool.config;

import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.AstMakeFacade;
import xyz.skycat.work.asttool.facade.IfAstMakeFacade;
import xyz.skycat.work.asttool.output.ConsoleOutputer;
import xyz.skycat.work.asttool.output.IfAstOutputer;
import xyz.skycat.work.asttool.output.TsvOutputer;

import java.nio.file.Paths;

/**
 * Created by SS on 2016/06/10.
 */
public class DefaultConfiguration implements IfConfiguration {

    private IfAstOutputer outputer;

    @Override
    public void setup() {

        // TODO read config file. [ f.e. YAML ]

//        this.outputer = new TsvOutputer(Paths.get("ast.tsv"));
        this.outputer = new ConsoleOutputer();
    }

    @Override
    public IfAstMakeFacade buildFacade() throws AstMakeException {

        setup();
        return new AstMakeFacade(this.outputer);
    }

}
