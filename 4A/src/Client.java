
public class Client {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));
        logger.logMessages("[INFO] This is an info message.");
        logger.logMessages("[DEBUG] This is a debug message.");
        logger.logMessages("[ERROR] This is an error message.");
    }
}

