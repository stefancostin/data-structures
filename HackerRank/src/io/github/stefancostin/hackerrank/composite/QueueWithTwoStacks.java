package io.github.stefancostin.hackerrank.composite;

import java.util.Stack;

public class QueueWithTwoStacks<E> {
	private Stack<E> stackNewestOnTop;
	private Stack<E> stackOldestOnTop;
	
	public QueueWithTwoStacks() {
		stackNewestOnTop = new Stack<>();
		stackOldestOnTop = new Stack<>();
	}

	public void enqueue(E element) {
		// Add to element to newest
		stackNewestOnTop.push(element);
	}
	
	public E peek() {
		// Show oldest element (Queue behavior)
		// Move all elements from stacNewestOnTop to stackOldestOnTop
		shiftStacks();
		return stackOldestOnTop.peek();
	}
	
	public E dequeue() {
		// Remove oldest element (Queue behavior)
		// Move all elements from stackNewestOnTop to stackOldestOnTop
		shiftStacks();
		return stackOldestOnTop.pop();
	}
	
	private void shiftStacks() {
		if (stackOldestOnTop.isEmpty()) {			
			while (!stackNewestOnTop.isEmpty()) {			
				stackOldestOnTop.push(stackNewestOnTop.pop());
			}
		}
	}
	
}
