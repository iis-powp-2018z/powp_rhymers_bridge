package edu.kis.vh.nursery.collections;

public class IntArrayStack {

	
	private static final int STACK_CAPACITY = 12;
	private static final int INITIAL_VALUE = -1;
	private static final int IS_FULL_RHYMER = 11;
	
	private int[] rhymerArray = new int[STACK_CAPACITY];
	private int total = INITIAL_VALUE;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			rhymerArray[++total] = in;
	}

	public boolean callCheck() {
		return total == INITIAL_VALUE;
	}

	public boolean isFull() {
		return total == IS_FULL_RHYMER;
	}

	public int peekaboo() {
		if (callCheck()) {
			return INITIAL_VALUE;
		}
		return rhymerArray[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return rhymerArray[total--];
	}

}
