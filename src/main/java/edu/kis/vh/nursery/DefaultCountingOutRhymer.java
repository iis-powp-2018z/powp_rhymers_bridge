package edu.kis.vh.nursery;

import stack.IntLinkedList;


public class DefaultCountingOutRhymer {
	
	protected Stack list;

	public DefaultCountingOutRhymer() {
		this.list = list;
	}
	public DefaultCountingOutRhymer(IntLinkedList list) {
		this.list = list;
	}

	public void countIn(int in) {
		list.push(in);
	}

	boolean isFull() {
		return list.isFull();
	}

	int peekaboo() {
		return list.top();
	}

	int countOut() {
		return list.pop();
	}

	boolean callCheck() {
		return list.isEmpty();

	}

}
