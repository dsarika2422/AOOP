package com.generic;

public class LinkedListStack<T> implements Stack<T>{
	private Node<T> top;
    private int size;

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
