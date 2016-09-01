package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.parseresult.ServiceParseResult;

import java.util.Collections;
import java.util.List;

/**
 * Created by SS on 2016/09/02.
 */
public class ServiceParseResultAggregator implements IfParseResultAggregator<ServiceParseResult> {

    private List<ServiceParseResult> parseResultList;

    @Override
    public void addParseResult(ServiceParseResult parseResult) {
        if (parseResultList == null) parseResultList = Collections.emptyList();
        parseResultList.add(parseResult);
    }

    @Override
    public List<ServiceParseResult> getParseResultList() {
        return parseResultList;
    }

}
