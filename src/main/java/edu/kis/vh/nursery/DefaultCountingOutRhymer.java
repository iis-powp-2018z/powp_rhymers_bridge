package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int FULL_STACK = 11;
	private static final int EMPTY_STACK = -1;
	private static final int STACK_CAPACITY = 12;

	private int[] numbers = new int[STACK_CAPACITY];

	// Dzialanie kombinacji klawiszy alt + -> oraz alt + <-
	// Kursor zostaje przestawiony w miejsce, w którym ostatnio nastapila
	// edycja.

	private int total = EMPTY_STACK;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK;
	}

	public boolean isFull() {
		return total == FULL_STACK;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_STACK;
		return numbers[total--];
	}

}
