package xyz.skycat.work.asttool.ae.aggregator;

import xyz.skycat.work.asttool.ae.ParseKindEnum;
import xyz.skycat.work.asttool.ae.parseresult.IfParseResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/09/02.
 */
public interface IfParseResultAggregator<T extends IfParseResult> {

    Map<ParseKindEnum, List<T>> getParseResultMap();

    default void addParseResult(ParseKindEnum parseKind, T parseResult) {
        if (getParseResultMap().containsKey(parseKind)) {
            List<T> parseResultList = getParseResultMap().get(parseKind);
            parseResultList.add(parseResult);
        } else {
            List<T> parseResultList = new ArrayList<>();
            parseResultList.add(parseResult);
            getParseResultMap().put(parseKind, parseResultList);
        }
    }

}
