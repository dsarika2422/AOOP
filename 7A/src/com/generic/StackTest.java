package com.generic;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStack(new ArrayStack<>());
        testStack(new LinkedListStack<>());
    }

    @SuppressWarnings("unchecked")
	private static <T> void testStack(Stack<T> stack) {
        System.out.println("Testing stack implementation: " + stack.getClass().getSimpleName());

        
        stack.push((T) Integer.valueOf(1));
        stack.push((T) Integer.valueOf(2));
        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Is empty: " + stack.isEmpty()); 
        System.out.println("Size: " + stack.size()); 

        
        stack.push((T) "Hello");
        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Is empty: " + stack.isEmpty());
	}

}
