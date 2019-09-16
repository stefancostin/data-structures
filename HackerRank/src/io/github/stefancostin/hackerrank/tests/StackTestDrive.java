package io.github.stefancostin.hackerrank.tests;

import io.github.stefancostin.hackerrank.datastructures.Stack;

public class StackTestDrive {
	private static int length = 5;
	
	public static void main(String[] args) {
		Stack s = new Stack();
		for (int i = 0; i < length; i++) {
			s.push(i);
		}
			
		System.out.println("Peek: " + s.peek());
		
		System.out.print("Read: ");
		s.read();
		
		System.out.println("Remove: " + s.pop());
	}
}
