package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int fullStack = 11;

	private static final int EmptyStack = -1;

	private static final int stackCapacity = 12;

	private int[] numbers = new int[stackCapacity];

	private int total = EmptyStack;

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EmptyStack;
	}

	public boolean isFull() {
		return total == fullStack;
	}

	public int peekaboo() {
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
