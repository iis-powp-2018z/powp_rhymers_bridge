package edu.kis.vh.nursery;

import stack.IntLinkedList;

public class DefaultCountingOutRhymer {
	
	protected IntLinkedList intLinkedList;

	public DefaultCountingOutRhymer() {
		this.intLinkedList = new IntLinkedList();
	}
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	boolean isFull() {
		return intLinkedList.isFull();
	}

	int peekaboo() {
		return intLinkedList.top();
	}

	int countOut() {
		return intLinkedList.pop();
	}

	boolean callCheck() {
		return intLinkedList.isEmpty();

	}

}
