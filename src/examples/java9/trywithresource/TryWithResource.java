package examples.java9.trywithresource;

import java.util.logging.Logger;

public class TryWithResource {
    private static final Logger logger = Logger.getLogger(TryWithResource.class.getName());
    public static void main(String[] args) {
        try(ClosableImplementation obj = new ClosableImplementation()) {
            obj.process();
        } catch (Exception e) {
            logger.warning("exception");
        }
    }
}

class ClosableImplementation implements AutoCloseable {
    private static final Logger logger = Logger.getLogger(ClosableImplementation.class.getName());
    @Override
    public void close() {
        logger.info("closing");
    }

    public void process() {
        logger.info("processing");
    }
}
