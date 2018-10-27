package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	
	private static final int RHYMER_CAPACITY = 12;
	private static final int INITIAL_VALUE = -1;
	private static final int IS_FULL_RHYMER = 11;
	
	private int[] rhymerArray = new int[RHYMER_CAPACITY];
	private int total = INITIAL_VALUE;

	public int getTotal() {
		return total;
	}

	void countIn(int in) {
		if (!isFull())
			rhymerArray[++total] = in;
	}

	boolean callCheck() {
		return total == INITIAL_VALUE;
	}

	boolean isFull() {
		return total == IS_FULL_RHYMER;
	}

	int peekaboo() {
		if (callCheck()) {
			return INITIAL_VALUE;
		}
		return rhymerArray[total];
	}

	int countOut() {
		if (callCheck())
			return -1;
		return rhymerArray[total--];
	}

}
