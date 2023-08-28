package examples.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeriodOfDay {
    private static final Logger logger = Logger.getLogger(PeriodOfDay.class.getName());

    public static void main(String[] args) {
        LocalTime date = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        logger.log(Level.INFO, "Date -> {0}", date.format(formatter));
    }
}
