package examples.java15;

import java.util.logging.Logger;

public class TextBlocks {
    private static final Logger logger = Logger.getLogger(TextBlocks.class.getName());
    public static void main(String[] args) {
        String text = """
               Chat:
               Hi!, How are you?
                                            I am doing "good", thanks.
                                            How about you?
               I am good, Thanks for asking.
                """;
        logger.info(text);
    }
}
