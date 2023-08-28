package examples.java9.modules.implementation;

import java.util.concurrent.atomic.AtomicInteger;

public class ImportantClass {
    private ImportantClass() {}
    static AtomicInteger importantData = new AtomicInteger();

    public static int getImportantData() {
        return importantData.incrementAndGet();
    }
}
