package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALIDVALUE = -1;
	private Node2 last;

	protected void push(int i) {
		if (last == null)
			last = new Node2(i);
		else {
			last.setNext(new Node2(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	protected boolean isFull() {
		return false;
	}

	protected int top() {
		if (isEmpty())
			return VALIDVALUE;
		return last.getValue();
	}

	protected int pop() {
		if (isEmpty())
			return VALIDVALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
 class Node2 {

	private final int value;
	private Node2 prev;
	private Node2 next;

	public Node2(int i) {
		value = i;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

	public Node2 getPrev() {
		return prev;
	}

	public void setPrev(Node2 prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	
}

