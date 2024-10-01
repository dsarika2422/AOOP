package com.SB;

import java.util.Random;

public class Producer implements Runnable{
	private final SharedBuffer buffer;
	private final String[] messages = {
	        "Welcome to the messaging system!",
	        
	    };
	    private final Random random = new Random();

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 try {
	            for (int i = 0; i < 10; i++) { 
	            	String message = messages[random.nextInt(messages.length)];
	                buffer.produce(message);
	                Thread.sleep(100); // Simulate time taken to produce a message
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	}

}
