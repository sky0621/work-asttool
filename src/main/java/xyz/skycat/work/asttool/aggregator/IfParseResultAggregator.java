package xyz.skycat.work.asttool.aggregator;

import xyz.skycat.work.asttool.parseresult.IfParseResult;

import java.util.List;

/**
 * Created by SS on 2016/09/02.
 */
public interface IfParseResultAggregator<T extends IfParseResult> {

    void addParseResult(T parseResult);

    List<T> getParseResultList();

}
