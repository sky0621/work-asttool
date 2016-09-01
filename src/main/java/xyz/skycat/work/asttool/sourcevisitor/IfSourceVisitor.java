package xyz.skycat.work.asttool.sourcevisitor;

import xyz.skycat.work.asttool.aggregator.IfParseResultAggregator;
import xyz.skycat.work.asttool.parser.IfSourceParser;
import xyz.skycat.work.asttool.parseresult.IfParseResult;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by SS on 2016/09/02.
 */
public interface IfSourceVisitor<PSR extends IfSourceParser, RES extends IfParseResult, AGG extends IfParseResultAggregator> extends FileVisitor<Path> {

    // I know Parser for parse source.
    // I know ParseResultAggregator for return result.

    PSR getParser();

    RES parse(Path file);

    AGG getParseResultAggregator();

    @Override
    default FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try {
            RES parseResult = getParser().parse(file);
            if (parseResult != null) {
                getParseResultAggregator().addParseResult(parseResult.getParseKind(), parseResult);
            }
        } catch (Exception e) {
            // TODO log!
            System.out.println(e.getMessage());
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    default FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // TODO think! what to do.
//        System.out.println("[PRE]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    default FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        // TODO error handling.
        System.out.println("[FAILED]" + file.getFileName().toString());
        return FileVisitResult.TERMINATE;
    }

    @Override
    default FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // TODO think! what to do.
//        System.out.println("[POST]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

}
