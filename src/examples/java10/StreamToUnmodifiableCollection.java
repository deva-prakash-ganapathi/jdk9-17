package examples.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StreamToUnmodifiableCollection {
    private static final Logger logger = Logger.getLogger(StreamToUnmodifiableCollection.class.getName());
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello world!");
        logger.log(Level.INFO, "list is {0}", list);
        var unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        logger.log(Level.INFO, "list2 is {0}", unmodifiableList);
        unmodifiableList.add("can't add this string");
    }
}
