package examples.java17;

import java.util.logging.Logger;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberGeneration {
    private static final Logger logger = Logger.getLogger(RandomNumberGeneration.class.getName());

    public static void main(String[] args) {
        logger.info(RandomGenerator.getDefault().getClass().getName());
        RandomGeneratorFactory.of(RandomGenerator.getDefault().getClass().getSimpleName())
                .create()
                .ints(10, 0,100)
                .mapToObj(Integer::toString)
                .forEach(logger::info);
    }
}
