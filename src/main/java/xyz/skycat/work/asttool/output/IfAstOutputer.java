package xyz.skycat.work.asttool.output;

import xyz.skycat.work.asttool.result.ParseResult;

/**
 * Created by SS on 2016/06/14.
 */
public interface IfAstOutputer {

    public void output();

    void setParseResult(ParseResult parseResult);

    ParseResult getParseResult();

}
