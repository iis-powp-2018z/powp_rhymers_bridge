package edu.kis.vh.nursery;

import stack.IntLinkedList;

public class DefaultCountingOutRhymer {

	private final IntLinkedList intLinkedList;

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public DefaultCountingOutRhymer() {
		intLinkedList = new IntLinkedList();
	}

	public int getTotal() {
		return intLinkedList.getSize();
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
