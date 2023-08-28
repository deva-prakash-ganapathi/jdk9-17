package examples.java9.modules.api;

import examples.java9.modules.implementation.ImportantClass;

import java.util.logging.Level;
import java.util.logging.Logger;

public class API {
    private static final Logger logger = Logger.getLogger(API.class.getName());

    public int getImportantData() {
        return ImportantClass.getImportantData();
    }

    public static void main(String[] args) {
        API api = new API();
        logger.log(Level.INFO, "Important data  -> {0}", api.getImportantData());
    }
}
