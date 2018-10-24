package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	IntArrayStack stack = new IntArrayStack();
	IntLinkedList list = new IntLinkedList();

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}
	
	public DefaultCountingOutRhymer() {
		super();
	}
	
	public int getTotal() {
		return stack.getTotal();
	}
	
	public int peekaboo() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int countOut() {
		return stack.countOut();
	}
}
