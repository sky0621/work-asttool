package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.parseresult.LogicParseResult;

import java.util.Collections;
import java.util.List;

/**
 * Created by SS on 2016/09/02.
 */
public class LogicParseResultAggregator implements IfParseResultAggregator<LogicParseResult> {

    private List<LogicParseResult> parseResultList;

    @Override
    public void addParseResult(LogicParseResult parseResult) {
        if (parseResultList == null) parseResultList = Collections.emptyList();
        parseResultList.add(parseResult);
    }

    @Override
    public List<LogicParseResult> getParseResultList() {
        return parseResultList;
    }

}
