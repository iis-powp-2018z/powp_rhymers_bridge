package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;

	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	protected boolean isEmpty() {
		return last == null;
	}

	protected boolean isFull() {
		return false;
	}

	protected int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	protected int pop() {
		if (isEmpty())
			return -1;
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
