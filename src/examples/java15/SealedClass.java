package examples.java15;

import java.util.logging.Logger;

public sealed class SealedClass permits ChildA, ChildB{
    static final Logger logger = Logger.getLogger(SealedClass.class.getName());
    public void commonMethod() {
        logger.info("in commonMethod");
    }
}
