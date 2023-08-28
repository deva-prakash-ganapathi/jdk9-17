package examples.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OptionalStream {
    private static final Logger logger = Logger.getLogger(OptionalStream.class.getName());
    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = new ArrayList<>();
        listOfOptionals.add(Optional.of("str1"));
        listOfOptionals.add(Optional.of("str2"));
        List<String> list = listOfOptionals.stream().flatMap(Optional::stream).toList();
        logger.log(Level.INFO, "list is {0}", list);
    }
}
