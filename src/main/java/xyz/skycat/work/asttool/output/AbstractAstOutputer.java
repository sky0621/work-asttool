package xyz.skycat.work.asttool.output;

import xyz.skycat.work.asttool.result.ParseResult;

import java.util.stream.Stream;

/**
 * Created by SS on 2016/06/16.
 */
public abstract class AbstractAstOutputer implements IfAstOutputer {

    private ParseResult parseResult;

    @Override
    public void setParseResult(ParseResult parseResult) {
        this.parseResult = parseResult;
    }

    @Override
    public ParseResult getParseResult() {
        return parseResult;
    }

}
