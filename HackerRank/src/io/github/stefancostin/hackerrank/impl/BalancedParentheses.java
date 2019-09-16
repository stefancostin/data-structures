package io.github.stefancostin.hackerrank.impl;

import java.util.Stack;

public class BalancedParentheses {
	public static char[][] TOKENS = {
			{'{', '}'},
			{'[', ']'},
			{'(', ')'}
	 };
	
	public boolean isBalance(String expression) {
		Stack<Character> stack = new Stack<>();
		for (char c : expression.toCharArray()) {
			if (isOpen(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || !matches(c, stack.pop())) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	private boolean isOpen(char c) {
		for (char[] array : TOKENS) {
			if (array[0] == c) {
				return true;
			}
		}
		return false;
	}
	
	private boolean matches(char c, char top) {
		for (char[] array : TOKENS) {
			if (array[0] == top && array[1] == c) {
				return true;
			}
		}
		return false;
	}
	
}
