package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int FULL_STACK = 11;

	private static final int STACK_CAPACITY = 12;

	private static final int EMPTY_STACK_ERROR = -1;

	private int[] NUMBERS = new int[STACK_CAPACITY];

	public int total = EMPTY_STACK_ERROR;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_ERROR;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isFull() {
		return total == FULL_STACK;
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

	private static int getEmptyStackError() {
		return EMPTY_STACK_ERROR;
	}

	private static int getStackCapacity() {
		return STACK_CAPACITY;
	}

	private static int getFullStack() {
		return FULL_STACK;
	}

} 
 