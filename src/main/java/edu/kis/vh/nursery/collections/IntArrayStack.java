package edu.kis.vh.nursery.collections;

public class IntArrayStack  {


	private static final int EMPTY_STACK_SIZE = -1;

	private static final int DEFAULT_STACK_CAPACITY = 12;
	

	private int[] numbers = new int[DEFAULT_STACK_CAPACITY];

	private int total = EMPTY_STACK_SIZE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY_STACK_SIZE;
	}

	public boolean isFull() {
		return total == DEFAULT_STACK_CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return 0;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return 0; //-1
		return numbers[total--];
	}
}