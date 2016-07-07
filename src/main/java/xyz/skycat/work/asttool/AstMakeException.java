package xyz.skycat.work.asttool;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/14.
 */
public class AstMakeException extends Exception {

    private Path sourceFilePath;

    public AstMakeException() {

    }

    public AstMakeException(Path sourceFilePath) {

        this.sourceFilePath = sourceFilePath;
    }

    public AstMakeException(Exception e) {

        super(e);
    }

    public AstMakeException(Path sourceFilePath, Exception e) {

        super(e);
        this.sourceFilePath = sourceFilePath;
    }

    public AstMakeException(String message, Path sourceFilePath) {

        super(message);
        this.sourceFilePath = sourceFilePath;
    }

    public AstMakeException(String message) {

        super(message);
    }

    public Path getSourceFilePath() {

        return sourceFilePath;
    }

    public String getSqlFileFullPath() {

        return sourceFilePath.normalize().toAbsolutePath().toString();
    }

}
