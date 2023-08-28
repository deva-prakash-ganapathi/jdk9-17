package examples.java12;

import java.util.logging.Logger;

public class StringMethods {
    private static final Logger logger = Logger.getLogger(StringMethods.class.getName());
    public static void main(String[] args) {
        String text = "Hello world!\nThis is Java 12.";
        text = text.indent(4);
        logger.info(text);
        text = text.indent(-10);
        logger.info(text);
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        logger.info(transformed);
    }
}
