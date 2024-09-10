import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsDescending {
	 public static void main(String[] args) {
	        // Create a list of strings
	        List<String> strings = new ArrayList<>();
	        strings.add("banana");
	        strings.add("apple");
	        strings.add("cherry");
	        strings.add("date");

	        // Sort the list in descending order using a lambda expression
	        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

	        // Print the sorted list
	        System.out.println("Sorted strings in descending order:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	    }
	}