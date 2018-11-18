package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class DefaultCountingOutRhymer {
	IntStack stack = null;

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}
	public DefaultCountingOutRhymer(IntLinkedList list) {
		super();
		this.stack = list;
	}
	public DefaultCountingOutRhymer() {
		this(new IntArrayStack());
	}
	public void countIn(int in) {
		stack.push(in);
		
		//stack.countIn(in);
	}
	public int peekaboo() {
        return stack.peek();
    }
	public boolean callCheck() {
		//return stack.callCheck();
		return stack.isEmpty();
	}
	public boolean isFull() {
		//return stack.isFull();
		return stack.isFull();
	}
	public int countOut() {
		//return stack.countOut();
		return stack.pop();
	}
}
