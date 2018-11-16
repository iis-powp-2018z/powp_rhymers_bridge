package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	protected IntArrayStack intArrayStack;

	public DefaultCountingOutRhymer() {
		this.intArrayStack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
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

	int countOut() {
		return intArrayStack.countOut();
	}

	boolean callCheck() {
		return intArrayStack.callCheck();

	}

}
