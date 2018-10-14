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
		//return stack.getTotal();
		return list.numberOfElements();
	}
	public void countIn(int in) {
		
		list.push(in);
		
		//stack.countIn(in);
	}
	public boolean callCheck() {
		//return stack.callCheck();
		return list.isEmpty();
	}
	public boolean isFull() {
		//return stack.isFull();
		return list.isFull();
	}
	protected int peekaboo() {
		//return stack.peekaboo();
		return list.top();
	}
	public int countOut() {
		//return stack.countOut();
		return list.pop();
	}
}
