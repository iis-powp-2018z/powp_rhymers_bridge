package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stack;

public class DefaultCountingOutRhymer {
	
	private Stack stack;
	
	public DefaultCountingOutRhymer() {
		super();
		stack = new IntLinkedList();
	}


	public DefaultCountingOutRhymer(Stack stack) {
		super();
		this.stack = stack;
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int countOut() {
		return stack.pop();
	}
	
	public int peekaboo() {
		return stack.top();
	}

}
