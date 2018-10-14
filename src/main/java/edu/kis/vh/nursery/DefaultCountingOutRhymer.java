package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		super();
		stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public int getTotal() {
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

	public int peekaboo() {
		return stack.peekaboo();
	}

}
