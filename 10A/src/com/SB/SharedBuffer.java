package com.SB;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	private final Queue<String> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); 
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); 
    }
    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); 
        return message;
    }
}
