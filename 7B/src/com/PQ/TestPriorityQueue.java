package com.PQ;

import java.util.Comparator;

public class TestPriorityQueue {
	public static void main(String[] args) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.insert(5);
        intQueue.insert(1);
        intQueue.insert(3);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());
        }

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.insert(2.5);
        doubleQueue.insert(1.1);
        doubleQueue.insert(3.3);
        System.out.println("\nDouble Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.remove());
        }

        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.insert("banana");
        stringQueue.insert("apple");
        stringQueue.insert("cherry");
        System.out.println("\nString Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.remove());
        }
    }
}
