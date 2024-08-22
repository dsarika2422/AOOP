
public class ErrorHandler extends LogHandler {

	@Override
	public void handle(String message) {
        if (message.startsWith("[ERROR]")) {
        	System.out.println("ERROR: " + message);
        } else {
            super.handle(message);
        }
    }
}