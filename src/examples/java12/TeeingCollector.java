package examples.java12;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {
    private static final Logger logger = Logger.getLogger(TeeingCollector.class.getName());
    public static void main(String[] args) {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        logger.log(Level.INFO, "mean is {0}", mean);
    }
}
