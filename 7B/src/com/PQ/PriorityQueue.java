package com.PQ;

import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<T> {
	private ArrayList<T> elements;
    private Comparator<? super T> comparator;

    public PriorityQueue(Comparator<? super T> comparator) {
        this.elements = new ArrayList<>();
        this.comparator = comparator;
    }

    public void insert(T item) {
        elements.add(item);
        siftUp(elements.size() - 1);
    }

    public T remove() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Priority queue is empty.");
        }
        T result = elements.get(0);
        elements.set(0, elements.remove(elements.size() - 1));
        siftDown(0);
        return result;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (comparator.compare(elements.get(index), elements.get(parentIndex)) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        int lastIndex = elements.size() - 1;
        while (index <= lastIndex) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestIndex = index;

            if (leftChildIndex <= lastIndex && comparator.compare(elements.get(leftChildIndex), elements.get(smallestIndex)) < 0) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex <= lastIndex && comparator.compare(elements.get(rightChildIndex), elements.get(smallestIndex)) < 0) {
                smallestIndex = rightChildIndex;
            }
            if (smallestIndex == index) {
                break;
            }
            swap(index, smallestIndex);
            index = smallestIndex;
        }
    }

    private void swap(int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}
