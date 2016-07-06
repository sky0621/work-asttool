package xyz.skycat.work.asttool.config;

import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.IfAstMakeFacade;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfConfiguration {

    void setup();

    IfAstMakeFacade buildFacade() throws AstMakeException;

}
