package xyz.skycat.work.asttool.parser;

import xyz.skycat.work.asttool.ParseKindEnum;

import java.nio.file.Path;

/**
 * Created by SS on 2016/07/08.
 */
public class LogicSourceParser implements IfSourceParser {

    @Override
    public boolean isTarget(Path path) {
        return path.toString().contains(getParseKind().getPackageName());
    }

    @Override
    public IfSourceParser getChain() {
        return new ServiceSourceParser();
    }

    @Override
    public ParseKindEnum getParseKind() {
        return ParseKindEnum.LOGIC;
    }

}
