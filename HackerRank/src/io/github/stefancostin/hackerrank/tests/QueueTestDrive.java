package io.github.stefancostin.hackerrank.tests;

import io.github.stefancostin.hackerrank.datastructures.Queue;

public class QueueTestDrive {
	private static int length = 5;
	
	public static void main(String[] args) {
		Queue q = new Queue();
		for (int i = 0; i < length; i++) {
			q.add(i);
		}
			
		System.out.println("Peek: " + q.peek());
		
		System.out.print("Read: ");
		q.read();
		
		System.out.println("Remove: " + q.remove());
	}
}
