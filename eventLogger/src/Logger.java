import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message, String severity) {
        String logEntry = "[" + severity.toUpperCase() + "] " + message +
                " (Timestamp: " + System.currentTimeMillis() + ")";
        logs.add(logEntry);
        System.out.println(logEntry);
    }
    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }
    public void clearLogs() {
        logs.clear();
    }
}
