package examples.java15;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class RecordDemo {
    private static final Logger logger = Logger.getLogger(RecordDemo.class.getName());
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord(1, "deva", "INTEGRATIONS");
        logger.log(Level.INFO, "Student -> {0}", student);
        logger.log(Level.INFO, "HashCode -> {0}", student.hashCode());
        record InLineRecord(int x, int y) {}
        List<InLineRecord> list = Stream.of(1, 2, 3, 4, 5).map(x -> new InLineRecord(x, x * x)).toList();
        logger.log(Level.INFO, "List -> {0}", list);
    }
}
