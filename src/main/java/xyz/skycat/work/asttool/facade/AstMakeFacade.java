package xyz.skycat.work.asttool.facade;

import xyz.skycat.work.asttool.exception.AstMakeException;
import xyz.skycat.work.asttool.facade.astnode.IfCompilationUnitWrapper;
import xyz.skycat.work.asttool.facade.astnode.visitor.ASTVisitorEx;
import xyz.skycat.work.asttool.facade.factory.SourceParserFactory;
import xyz.skycat.work.asttool.facade.sourceparser.IfSourceParser;
import xyz.skycat.work.asttool.output.IfAstOutputer;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/13.
 */
public class AstMakeFacade implements IfAstMakeFacade {

    private IfAstOutputer astOutputer;    // For provide output way. [console? or tsv? or ...]

    public AstMakeFacade(IfAstOutputer outputer) throws AstMakeException {

        astOutputer = outputer;
    }

    @Override
    public void parseProcess(Path sourceFilePath) throws AstMakeException {

        if (sourceFilePath == null) {
            // TODO log
            throw new AstMakeException(new IllegalArgumentException("sourceFilePath is null"));
        }

        IfSourceParser parser = SourceParserFactory.createSourceParser();
        IfCompilationUnitWrapper compilationUnitWrapper = parser.parse(sourceFilePath);

        ASTVisitorEx visitor = new ASTVisitorEx();

        compilationUnitWrapper.get().accept(visitor);

        astOutputer.setParseResult(visitor.getParseResult());
        astOutputer.output();
    }

}
