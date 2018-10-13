package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALIDVALUE = -1;
	private Node last;

	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
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
