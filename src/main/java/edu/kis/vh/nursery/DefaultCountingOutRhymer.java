package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int fullStack = 11;

	private static final int EmptyStack = -1;

	private static final int stackCapacity = 12;

	private int[] numbers = new int[stackCapacity];

	private int total = EmptyStack;

	protected int getTotal() {
		return total;
	}

	protected void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EmptyStack;
	}

	protected boolean isFull() {
		return total == fullStack;
	}

	protected int peekaboo() {
		if (callCheck())
			return EmptyStack;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return EmptyStack;
		return numbers[total--];
	}

}
