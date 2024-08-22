package SolidExamples;

public class MainLSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird sparrow = new Sparrow();
	        sparrow.fly(); // Works fine

	        Bird ostrich = new Ostrich();
	        try {
	            ostrich.fly(); // Causes issue
	        } catch (UnsupportedOperationException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
