package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.ParseKindEnum;
import xyz.skycat.work.asttool.parseresult.ServiceParseResult;

import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/09/02.
 */
public class ServiceParseResultAggregator implements IfParseResultAggregator<ServiceParseResult> {

    private Map<ParseKindEnum, List<ServiceParseResult>> parseResultMap;

    @Override
    public Map<ParseKindEnum, List<ServiceParseResult>> getParseResultMap() {
        return parseResultMap;
    }

}
