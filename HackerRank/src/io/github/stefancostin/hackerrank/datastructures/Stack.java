package io.github.stefancostin.hackerrank.datastructures;

public class Stack {
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node top; // add and remove things here
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		return top.data;
	}
 	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		int data = top.data;
		if (top.next == null) {
			top = null;
		} else {
			top = top.next;						
		}
//		try {			
//			top = top.next;
//		} catch (NullPointerException e) {
//			System.out.println("Reached the bottom of the stack.");
//		}
		return data;
	}
	
	/**
	 * This method is added by myself and it is
	 * not a part of the Hacker Rank tutorial.
	 */
	public void read() {
		Node i = top;
		while (i != null) {
			System.out.print(i.data + " ");
			i = i.next;
		}
		System.out.println("\n");
	}
}
