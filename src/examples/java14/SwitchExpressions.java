package examples.java14;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SwitchExpressions {
    private static final Logger logger = Logger.getLogger(SwitchExpressions.class.getName());

    public static void main(String[] args) {
        String day = LocalDateTime.now().getDayOfWeek().toString();
        boolean isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
        if(!isTodayHoliday) {
            logger.info("Today is not a holiday");
        }
        logger.log(Level.INFO, "Operation value -> {0}", modify(4, "multiply"));
        logger.log(Level.INFO, "Operation value -> {0}", modify(2, "add"));

    }

    static int modify(int a, String operation) {
        return switch (operation) {
            case "add" -> {
                logger.info("add is called");
                yield a+a;
            }
            case "multiply" -> {
                logger.info("multiply is called");
                yield a*a;
            }
            default -> throw new IllegalArgumentException("No such operation exists");
        };
    }
}
