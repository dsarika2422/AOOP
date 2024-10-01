public class NumberPrinter {
	 public static void main(String[] args) {
	        Thread printTwo = new printTwo();
	        Thread printThree = new printThree();
	        Thread printFour = new printFour();
	        Thread printFive = new printFive();
	        Thread printNumber = new printNumber();

	        printTwo.start();
	        printThree.start();
	        printFour.start();
	        printFive.start();
	        printNumber.start();
	    }
	}