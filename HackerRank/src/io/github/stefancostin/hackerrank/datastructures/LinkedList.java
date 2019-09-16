package io.github.stefancostin.hackerrank.datastructures;

public class LinkedList<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;
		
		private Node(T data) {
			this.data = data;
		}
	}
	
	public Node<T> head;
	
	public void append(T data) {
		if (head == null) {
			this.head = new Node<T>(data);
			return;
		}
		
		// Iterating through Linked List
		Node<T> current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		
		// Appending Node
		current.next = new Node<T>(data);
	}
	
	public void prepend(T data) {
		if (head == null) {
			return;
		}
		
		// Create new Head
		Node<T> nextHead = new Node<T>(data);
		nextHead.next = head;
		
		// Assign new Head
		head = nextHead;
	}
	
	public void deleteWithValue(T data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		
		Node<T> current = this.head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			} else {				
				current = current.next;
			}
		}
	}
	
	public void readList() {
		Node<T> current = this.head;
		System.out.print(current.data + "  ");
		while (current.next != null) {
			System.out.print(current.next.data + "  ");
			current = current.next;
		}
		System.out.print("\n");
	}
}
