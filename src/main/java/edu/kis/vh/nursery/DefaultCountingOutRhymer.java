package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementsStack.IntLinkedList;

public class DefaultCountingOutRhymer {

	private Stack stack;

	public DefaultCountingOutRhymer() {

		this.stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(Stack stack) {
		this.stack = stack;
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
