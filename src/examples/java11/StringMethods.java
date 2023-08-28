package examples.java11;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringMethods {
    private static final Logger logger = Logger.getLogger(StringMethods.class.getName());
    public static void main(String[] args) {
        String multilineString = "String1 \n \n String 2 \n String 3";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .toList();
        logger.log(Level.INFO, "list is {0}", lines);
        logger.log(Level.INFO, "demonstration of repeat method {0}", lines.get(0).repeat(3));
    }
}
