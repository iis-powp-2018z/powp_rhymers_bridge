package edu.kis.vh.nursery;
// kombinacja alt + <- lub alt + -> powoduje przełączanie się między zakładakmi (otwartymi klasami)
public class IntArrayStack {
	private static final int FULL = 11;

	private static final int EMPTY_STACK_ERROR = -1;

	private static final int STACK_CAPACITY = 12;

	private int[] NUMBERS = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_ERROR;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_ERROR;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return NUMBERS[total--];
	}
}
