package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private IntArrayStack intArrayStack;
	
	public DefaultCountingOutRhymer() {
		super();
		intArrayStack = new IntArrayStack();
	}


	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		super();
		this.intArrayStack = intArrayStack;
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
	
	public int peekaboo() {
		return intArrayStack.peekaboo();
	}

}
