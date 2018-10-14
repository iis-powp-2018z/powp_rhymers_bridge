package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int fullStack = 11;

	private static final int EmptyStack = -1;

	private static final int stackCapacity = 12;

	private int[] numbers = new int[stackCapacity];

	public int total = EmptyStack;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EmptyStack;
	}

	public boolean isFull() {
		return total == fullStack;
	}

	protected int peekaboo() {
		if (callCheck())
			return EmptyStack;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EmptyStack;
		return numbers[total--];
	}

}
