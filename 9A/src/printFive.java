
public class printFive extends Thread{
	public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0) {
                System.out.println("Divisible by 5: " + i);
            }
        }
    }
}
