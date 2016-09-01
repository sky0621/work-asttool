package xyz.skycat.work.asttool.ae.parser;

import xyz.skycat.work.asttool.ae.AstMakeException;
import xyz.skycat.work.asttool.ae.parseresult.IfParseResult;

import java.nio.file.Path;

/**
 * Created by SS on 2016/07/08.
 */
public interface IfSourceParser {

    // CoR
    // TemplateMethod

    public default IfParseResult parse(Path sourceFilePath) throws AstMakeException {

        // TODO
        return null;
    }

}
