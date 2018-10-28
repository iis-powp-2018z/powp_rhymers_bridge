package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int CHECK_FULL = 11;

	private static final int CHECK_ERROR = -1;

	private static final int ARRAY_SIZE = 12;

	private int[] NUMBERS = new int[ARRAY_SIZE];

	private int total = CHECK_ERROR;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == CHECK_ERROR;
	}

	public boolean isFull() {
		return total == CHECK_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return CHECK_ERROR;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return CHECK_ERROR;
		return NUMBERS[total--];
	}

}
