package edu.kis.vh.nursery;

public class IntArrayStack {
	private static final int STACK_CAPACITY = 12;

	private static final int EMPTY_STACK_ERROR = -1;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_ERROR;

	public int getTotal() {
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY_STACK_ERROR;
	}

	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return numbers[total--];
	}
}
