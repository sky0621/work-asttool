package xyz.skycat.work.asttool;

import xyz.skycat.work.asttool.parts.IfInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by SS on 2016/07/11.
 */
public class ParseResultMerger {

    public static List<IfInformation> mergeParseResult(Map<ParseKindEnum, List<ParseResult>> parseResultMap) {
        List<IfInformation> informationList = new ArrayList<>();
        List<ParseResult> actionList = parseResultMap.get(ParseKindEnum.ACTION);
        actionList.parallelStream().forEach(action -> {
            action.methodInformationList.parallelStream().filter(method -> method.isExecute).forEach(method -> {
                method.fragmentInformationList.parallelStream().filter(fragment -> {
                    return fragment.caller.contains("logic") || fragment.caller.contains("service");
                }).forEach(fragment -> {

                });
            });
        });
        return informationList;
    }

}
