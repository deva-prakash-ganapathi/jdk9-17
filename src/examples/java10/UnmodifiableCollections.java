package examples.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnmodifiableCollections {
    private static final Logger logger = Logger.getLogger(UnmodifiableCollections.class.getName());
    public static void main(String[] args) {
        List<String> modifiableList = new ArrayList<>();
        modifiableList.add("hello");
        logger.log(Level.INFO, "list is {0}", modifiableList);
        var unmodifiableList = List.copyOf(modifiableList);
        logger.log(Level.INFO, "list2 is {0}", unmodifiableList);
        unmodifiableList.add("world");

    }
}
