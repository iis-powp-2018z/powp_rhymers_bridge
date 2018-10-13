package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALIDVALUE = -1;
	Node last;
	int i;

	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
		return last.value;
	}

	protected int pop() {
		if (isEmpty())
			return VALIDVALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
