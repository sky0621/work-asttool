package xyz.skycat.work.asttool.facade.factory;

import xyz.skycat.work.asttool.facade.sourceparser.SourceParser;

/**
 * Created by SS on 2016/06/06.
 */
public class SourceParserFactory {

    public static SourceParser createSourceParser() {
        return new SourceParser();
    }

}
