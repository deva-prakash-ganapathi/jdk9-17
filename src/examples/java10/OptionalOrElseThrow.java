package examples.java10;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OptionalOrElseThrow {
    private static final Logger logger = Logger.getLogger(OptionalOrElseThrow.class.getName());
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5);
        Integer firstEven = list.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();
        logger.log(Level.INFO, "first even number {0}", firstEven);
    }
}
