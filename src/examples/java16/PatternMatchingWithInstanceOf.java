package examples.java16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatternMatchingWithInstanceOf {
    private static final Logger logger = Logger.getLogger(PatternMatchingWithInstanceOf.class.getName());

    public static void main(String[] args) {
        List<String> list = List.of("str1, str2");
        checkAndPrintList(list);
    }

    private static void checkAndPrintList(Collection<String> list) {
        if((list instanceof ArrayList<String>)) {
            return;
        }
        if(list instanceof List<String> strList) {
            logger.log(Level.INFO, "ArrayList -> {0}", strList);
        }
    }
}
