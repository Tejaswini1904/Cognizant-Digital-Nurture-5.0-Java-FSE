public class Logger {

    // Create only one instance
    private static Logger instance = new Logger();

    // Private constructor
    private Logger() {
        System.out.println("Logger object created.");
    }

    // Return the single instance
    public static Logger getInstance() {
        return instance;
    }

    // Log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
