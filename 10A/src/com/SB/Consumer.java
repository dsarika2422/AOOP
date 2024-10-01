package com.SB;

public class Consumer implements Runnable{
	 private final SharedBuffer buffer;

	    public Consumer(SharedBuffer buffer) {
	        this.buffer = buffer;
	    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            for (int i = 0; i < 10; i++) { 
            	String message = buffer.consume();
                System.out.println("Processed: " + message); 
                Thread.sleep(150); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}

}
