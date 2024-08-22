
public class UserAuthentication {
	 private static UserAuthentication instance;

	    private UserAuthentication() { }

	    public static UserAuthentication getInstance() {
	        if (instance == null) {
	            instance = new UserAuthentication();
	        }
	        return instance;
	    }

	    public void authenticate(String username, String password) {
	        System.out.println("User " + username + " authenticated.");
	    }
}
