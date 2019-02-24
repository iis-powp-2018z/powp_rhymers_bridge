package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Stack;

public class DefaultCountingOutRhymer {
	
	private Stack intLinkedList;
	
	public DefaultCountingOutRhymer() {
		super();
		intLinkedList = new IntLinkedList();
	}


	public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
		super();
		this.intLinkedList = intArrayStack;
	}

	public int getTotal() {
		return intLinkedList.getTotal();
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	public int countOut() {
		return intLinkedList.pop();
	}
	
	public int peekaboo() {
		return intLinkedList.top();
	}

}
