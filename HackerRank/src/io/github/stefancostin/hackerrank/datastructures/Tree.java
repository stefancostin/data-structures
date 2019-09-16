package io.github.stefancostin.hackerrank.datastructures;

public class Tree {
	private class Node {
		Node left, right;
		int data;
		
		private Node (int data) {
			this.data = data;
		}
		
		private void insert(int value) {
			if (value <= data) {
				if (left == null) {
					left = new Node(value);
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new Node(value);
				} else {
					right.insert(value);
				}
			}
		}
		
		private boolean contains(int value) {
			if (value == data) {
				return true;
			}
			
			if (value < data) {
				if (left == null) {
					return false;
				} else {					
					return left.contains(value);
				}
			} else {
				if(right == null) {
					return false;
				}
				return right.contains(value);
			}
		}
		
		private void inorderPrint() {
			if (left != null) {
				left.inorderPrint();
			}
			System.out.println(data);
			if (right != null) {
				right.inorderPrint();
			}
		}
		
	}
	
	/**
	 * Unnecessary wrapper around Node
	 */
	Node root;
	public Tree(int data) {
		this.root = new Node(data);
	}
	
	public void insert(int data) {
		root.insert(data);
	}
	
	public boolean contains(int data) {
		return root.contains(data);
	}
	
	public void inorderPrint() {
		root.inorderPrint();
	}
}
