package xyz.skycat.work.asttool.output;

import xyz.skycat.work.asttool.result.ParseResult;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Created by SS on 2016/06/15.
 */
public class TsvOutputer extends AbstractAstOutputer {

    private Path outputFilePath;

    public TsvOutputer(Path outputFilePath) {

        this.outputFilePath = outputFilePath;
        try {
            Files.deleteIfExists(this.outputFilePath);
            Files.createFile(this.outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void output() {

        try (BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardOpenOption.APPEND)) {

            // FIXME
            ParseResult res2 = getParseResult();
//            getStreamData().forEach(tableName -> {
//                try {
//                    writer.write(String.format("%s\t", tableName));
//                } catch (IOException e) {
//                    // TODO �G���[�n���h�����O�I
//                    e.printStackTrace();
//                }
//            });
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            // TODO �G���[�n���h�����O�I
            e.printStackTrace();
        }
    }

}
