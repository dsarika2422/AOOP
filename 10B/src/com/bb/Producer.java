package com.bb;

import java.util.Random;

public class Producer implements Runnable{
	 private final BoundedBuffer buffer;
	 private final String[] itemNames = {
		        "Widget A", "Gadget B", "Device C", 
		        "Tool D", "Apparatus E", "Instrument F", 
		        "Component G", "Part H", "Unit I", "Element J"
		    };
		    private final Random random = new Random();

		    public Producer(BoundedBuffer buffer) {
		        this.buffer = buffer;
		    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            for (int i = 0; i < 20; i++) { // Produce 20 items
                String item = itemNames[random.nextInt(itemNames.length)];
                buffer.produce(item);
                Thread.sleep(random.nextInt(100)); // Simulate variable time to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

