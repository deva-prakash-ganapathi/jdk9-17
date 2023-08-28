package examples.java11;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionToArray {
    private static final Logger logger = Logger.getLogger(CollectionToArray.class.getName());
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        logger.log(Level.INFO, "Array {0}", Arrays.toString(sampleArray));
    }
}
