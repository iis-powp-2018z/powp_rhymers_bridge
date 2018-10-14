package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	public Node prev, next;

	public int getValue() {
		return value;
	}

	Node(int i) {
		value = i;
	}

}

// Alt + ← Go to previous opened editor. Cursor is placed where it was before you opened the next editor
// Alt + → Similar Alt + ← but opens the next editor