package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.ParseKindEnum;
import xyz.skycat.work.asttool.parseresult.LogicParseResult;

import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/09/02.
 */
public class LogicParseResultAggregator implements IfParseResultAggregator<LogicParseResult> {

    private Map<ParseKindEnum, List<LogicParseResult>> parseResultMap;

    @Override
    public Map<ParseKindEnum, List<LogicParseResult>> getParseResultMap() {
        return parseResultMap;
    }

}
