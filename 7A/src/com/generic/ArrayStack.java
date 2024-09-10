package com.generic;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
 
	private T[] stack;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        stack = (T[]) new Object[INITIAL_CAPACITY];
        top = -1;
    }
    
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		if (top == stack.length - 1) {
            resize();
        }
        stack[++top] = item;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack[top];
        stack[top--] = null; // Avoid memory leak
        return item;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return top == -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		 return top + 1;
	 }

    private void resize() {
        stack = Arrays.copyOf(stack, stack.length * 2);
	}

}
