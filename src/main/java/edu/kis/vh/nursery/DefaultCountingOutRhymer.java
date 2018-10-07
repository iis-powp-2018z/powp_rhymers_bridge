package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAYSIZE = 12;

	private static final int VALIDRESULT = -1;

	private int[] numbers = new int[ARRAYSIZE];

	public int total = VALIDRESULT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == VALIDRESULT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return VALIDRESULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return VALIDRESULT;
		return numbers[total--];
	}

}
