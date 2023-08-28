package examples.java12;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompactNumberFormatter {
    private static final Logger logger = Logger.getLogger(CompactNumberFormatter.class.getName());
    public static void main(String[] args) {
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        logger.log(Level.INFO, "{0}", likesShort.format(2592));
        logger.log(Level.INFO, "{0}", likesShort.format(3000000));

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        logger.log(Level.INFO, "{0}", likesLong.format(2592));
        logger.log(Level.INFO, "{0}", likesLong.format(3000000));
    }
}
