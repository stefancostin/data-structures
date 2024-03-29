package io.github.stefancostin.hackerrank.datastructures;

public class Queue {
	private static class Node {
		private int data;
		private Node next;
		
		private Node (int data) {
			this.data = data;
		}
	}
	
	private Node head; // remove things from the head
	private Node tail; // add things here
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}
	
	public int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}
	
	/**
	 * This method is added by myself and it is
	 * not a part of the Hacker Rank tutorial.
	 */
	public void read() {
		if (head == null) {
			System.out.println("Queue is empty.");
		} else {			
			Node i = head;
			while (i != null) {
				System.out.print(i.data + " ");
				i = i.next;
			}
			
			System.out.print("\n");
		}
	}
}
