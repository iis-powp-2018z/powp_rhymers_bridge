package edu.kis.vh.nursery;

class DefaultCountingOutRhymer {

	private static final int _11 = 11;

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == _11;
	}

	public int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
