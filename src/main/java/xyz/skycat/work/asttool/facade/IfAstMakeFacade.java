package xyz.skycat.work.asttool.facade;

import xyz.skycat.work.asttool.exception.AstMakeException;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfAstMakeFacade {

    public void parseProcess(Path sourceFilePath) throws AstMakeException;

}
