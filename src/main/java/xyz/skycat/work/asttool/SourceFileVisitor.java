package xyz.skycat.work.asttool;

import xyz.skycat.work.asttool.parser.IfSourceParser;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by SS on 2016/06/04.
 */
public class SourceFileVisitor implements FileVisitor<Path> {

    private IfSourceParser fileParser;
    public ParseResultAggregator parseResultAggregator;

    public void setIfAstMakeFacade(IfSourceParser fileParser) {
        this.fileParser = fileParser;
        parseResultAggregator = new ParseResultAggregator();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // TODO think! what to do.
//        System.out.println("[PRE]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try {
            ParseResult parseResult = fileParser.parse(file);
            if (parseResult != null) {
                parseResultAggregator.addParseResult(parseResult.parseKind, parseResult);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        // TODO error handling.
        System.out.println("[FAILED]" + file.getFileName().toString());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // TODO think! what to do.
//        System.out.println("[POST]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

}
