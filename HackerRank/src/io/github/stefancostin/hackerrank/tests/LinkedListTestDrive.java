package io.github.stefancostin.hackerrank.tests;

import io.github.stefancostin.hackerrank.datastructures.LinkedList;

public class LinkedListTestDrive {
	public static void main (String[] args) {
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			linkList.append(i);
		}
		
		linkList.readList();
		
		// Append 10 an 32
		linkList.append(10);
		linkList.append(32);
		linkList.readList();
		
		// Prepend 665
		linkList.prepend(662);
		linkList.readList();
		
		// Remove 0 from list
		linkList.deleteWithValue(0);
		linkList.readList();
	}
}
