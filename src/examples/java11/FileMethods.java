package examples.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class FileMethods {
    private static final Logger logger = Logger.getLogger(FileMethods.class.getName());
    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of(System.getProperty("user.dir")), "demo", ".txt"), "Sample text");
        String content = Files.readString(filePath);
        logger.info(content);
        Files.writeString(filePath, "Hello World");
        content = Files.readString(filePath);
        logger.info(content);
    }
}
