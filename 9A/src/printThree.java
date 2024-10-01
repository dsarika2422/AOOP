
public class printThree extends Thread {
	public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisible by 3: " + i);
            }
        }
    }
}
