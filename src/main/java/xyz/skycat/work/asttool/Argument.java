package xyz.skycat.work.asttool;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by SS on 2016/06/10.
 */
public class Argument {

    public static Path parse(String... args) {

        // TODO various check!

        // args[0] is target root directory
        return Paths.get(args[0]).toAbsolutePath();
    }

}
