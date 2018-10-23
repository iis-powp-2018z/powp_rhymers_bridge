package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
 
	private static final int TOTAL_MAX = 11;

	private static final int TOTAL = -1;

	private static final int MAX_NUMBERS = 12;

	private int[] numbers = new int[MAX_NUMBERS];

	public int total = TOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL;
	}

	public boolean isFull() {
		return total == TOTAL_MAX;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL;
		return numbers[total--];
	}

}
