
public class TitleCaseConverter {
	 public String toTitleCase(String input) {
	        if (input == null || input.isEmpty()) {
	            return input; // Return null or empty string as is
	        }

	        StringBuilder titleCase = new StringBuilder();
	        String[] words = input.split(" ");

	        for (String word : words) {
	            if (word.length() > 0) {
	                titleCase.append(Character.toUpperCase(word.charAt(0)))
	                         .append(word.substring(1).toLowerCase())
	                         .append(" ");
	            }
	        }

	        return titleCase.toString().trim(); // Remove trailing space
	    }
}
