package xyz.skycat.work.asttool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/07/08.
 */
public class ParseResultAggregator {

    public Map<ParseKindEnum, List<ParseResult>> parseResultMap;

    public ParseResultAggregator() {
        parseResultMap = new HashMap<>();
    }

    public void addParseResult(ParseKindEnum parseKind, ParseResult parseResult) {
        if (parseResultMap.containsKey(parseKind)) {
            List<ParseResult> parseResultList = parseResultMap.get(parseKind);
            parseResultList.add(parseResult);
        } else {
            List<ParseResult> parseResultList = new ArrayList<>();
            parseResultList.add(parseResult);
            parseResultMap.put(parseKind, parseResultList);
        }
    }

}
