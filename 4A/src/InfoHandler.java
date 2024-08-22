
public class InfoHandler extends LogHandler{
	 public void handle(String message) {
	        if (message.startsWith("[INFO]")) {
	            System.out.println("INFO: " + message);
	        } else {
	            super.handle(message);
	        }
	    }
	}