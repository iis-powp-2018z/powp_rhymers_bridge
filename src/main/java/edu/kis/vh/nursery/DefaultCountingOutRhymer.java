package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
 
	private static final int TOTAL_START = -1;

	private static final int NUMBERS_MAX = 12;

	private int[] numbers = new int[NUMBERS_MAX];

	private int total = TOTAL_START;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_START;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total--];
	}

}
