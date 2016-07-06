package xyz.skycat.work.asttool.facade.sourceparser;

import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.astnode.IfCompilationUnitWrapper;

import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSourceParser {

    IfCompilationUnitWrapper parse(Path sourceFilePath) throws AstMakeException;

}
