package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.ParseKindEnum;
import xyz.skycat.work.asttool.parseresult.ActionParseResult;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/09/02.
 */
public class ActionParseResultAggregator implements IfParseResultAggregator<ActionParseResult> {

    private Map<ParseKindEnum, List<ActionParseResult>> parseResultMap;

    @Override
    public Map<ParseKindEnum, List<ActionParseResult>> getParseResultMap() {
        if (parseResultMap == null) parseResultMap = Collections.unmodifiableMap(Collections.EMPTY_MAP);
        return parseResultMap;
    }

}
