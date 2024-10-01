package com.bb;

public class Consumer implements Runnable{
	 private final BoundedBuffer buffer;

	    public Consumer(BoundedBuffer buffer) {
	        this.buffer = buffer;
	    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            for (int i = 0; i < 20; i++) { // Consume 20 items
                String item = buffer.consume();
                System.out.println("Processed: " + item); // Added context to the output
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}