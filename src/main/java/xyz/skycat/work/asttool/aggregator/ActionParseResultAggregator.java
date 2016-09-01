package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.parseresult.ActionParseResult;

import java.util.Collections;
import java.util.List;

/**
 * Created by SS on 2016/09/02.
 */
public class ActionParseResultAggregator implements IfParseResultAggregator<ActionParseResult> {

    private List<ActionParseResult> parseResultList;

    @Override
    public void addParseResult(ActionParseResult parseResult) {
        if (parseResultList == null) parseResultList = Collections.emptyList();
        parseResultList.add(parseResult);
    }

    @Override
    public List<ActionParseResult> getParseResultList() {
        return parseResultList;
    }

}
