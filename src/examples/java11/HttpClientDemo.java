package examples.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpClientDemo {
    private static final Logger logger = Logger.getLogger(HttpClientDemo.class.getName());
    public static void main(String[] args) {
        try (var executorProvider = new AutoClosableExecutor(Executors.newFixedThreadPool(10))){
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .connectTimeout(Duration.ofMinutes(1))
                    .executor(executorProvider.get())
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://official-joke-api.appspot.com/random_joke"))
                    .GET()
                    .build();
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(logger::info).join();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "", e);
        }
    }
}

class AutoClosableExecutor implements AutoCloseable {
    ExecutorService executor;
    public AutoClosableExecutor(ExecutorService executor) {
        this.executor = executor;
    }

    ExecutorService get() {
        return executor;
    }

    @Override
    public void close() {
        executor.shutdown();
    }
}
