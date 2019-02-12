package edu.kis.vh.nursery.collections;

public class IntLinkedList implements Stack {

	private Node last;
	private int size;

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
			return INITIAL_VALUE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return INITIAL_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	public int getTotal() {
		return size;
	}

}
