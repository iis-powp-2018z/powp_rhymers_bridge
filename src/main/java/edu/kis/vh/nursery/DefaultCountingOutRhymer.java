package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
 
	private static final int FULL_STACK = 11;

	private static final int TOTAL_START = -1;

	private static final int NUMBERS_MAX = 12;
	

	private int[] numbers = new int[NUMBERS_MAX];

	private int total = TOTAL_START;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == TOTAL_START;
	}

	protected boolean isFull() {
		return total == FULL_STACK;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total--];
	}

	private int getTotal() {
		return total;
	}

	private void setTotal(int total) {
		this.total = total;
	}

}
