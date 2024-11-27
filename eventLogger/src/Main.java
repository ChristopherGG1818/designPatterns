public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started.", "INFO");
        logger.log("Fetching user data.", "DEBUG");
        logger.log("Unable to connect to the database.", "ERROR");

        System.out.println("\nLog History:");
        for (String log : logger.getLogs()) {
            System.out.println(log);
        }

        logger.clearLogs();
        System.out.println("\nLogs after clearing:");
        System.out.println(logger.getLogs());
    }
}
