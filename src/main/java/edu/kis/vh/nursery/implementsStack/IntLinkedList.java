package edu.kis.vh.nursery.implementsStack;

import edu.kis.vh.nursery.Stack;

public class IntLinkedList implements Stack {

	private static final int EMPTY_STACK = -1;

	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	int getI() {
		return i;
	}

	Node getLast() {
		return last;
	}

}

class Node {

	protected int value;
	protected Node prev, next;

	protected Node(final int i) {
		value = i;
	}

}

//alt + strzałki
//Przeskoczenie pomiędzy ostatnio edytowanymi plikami do lokalizacji gdzie wykonywana była ostatia zmiana.
//Strzałka w lewo cofa się w historii, strzałka w prawo idzie do przodu.
