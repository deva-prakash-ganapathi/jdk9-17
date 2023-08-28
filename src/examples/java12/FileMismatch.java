package examples.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileMismatch {
    private static final Logger logger = Logger.getLogger(FileMismatch.class.getName());
    public static void main(String[] args) throws IOException {
        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12 Demo");
        Files.writeString(filePath4, "Java 12 Tutorial");
        long mismatch = Files.mismatch(filePath3, filePath4);//-1 if identical
        logger.log(Level.INFO, "index is {0}", mismatch);
    }
}
