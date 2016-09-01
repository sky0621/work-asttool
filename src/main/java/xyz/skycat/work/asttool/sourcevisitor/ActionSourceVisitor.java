package xyz.skycat.work.asttool.sourcevisitor;

import xyz.skycat.work.asttool.aggregator.ActionParseResultAggregator;
import xyz.skycat.work.asttool.parser.ActionSourceParser;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by SS on 2016/09/02.
 */
public class ActionSourceVisitor implements IfSourceVisitor<ActionParseResultAggregator> {

    private ActionSourceParser sourceParser;
    private ActionParseResultAggregator parseResultAggregator;

    public ActionSourceVisitor() {
        sourceParser = new ActionSourceParser();
        parseResultAggregator = new ActionParseResultAggregator();
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return null;
    }

    @Override
    public ActionParseResultAggregator getParseResultAggregator() {
        return parseResultAggregator;
    }
}
