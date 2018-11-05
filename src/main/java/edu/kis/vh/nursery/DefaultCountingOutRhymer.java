package edu.kis.vh.nursery;

import stack.IntArrayStack;

public class DefaultCountingOutRhymer {
	
	private final IntArrayStack intArrayStack;
	
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}
	
	public DefaultCountingOutRhymer() {
		intArrayStack = new IntArrayStack();
	}
	public int getTotal() {
		return intArrayStack.getTotal();
	}
 	public void countIn(int in) {
		intArrayStack.countIn(in);
	}
 	boolean isFull() {
 	return intArrayStack.isFull();
}
	int peekaboo() {
		return intArrayStack.peekaboo();
	}
 	int countOut() {return intArrayStack.countOut();
	}
 	boolean callCheck() {
		return intArrayStack.callCheck();
	}

} 
 