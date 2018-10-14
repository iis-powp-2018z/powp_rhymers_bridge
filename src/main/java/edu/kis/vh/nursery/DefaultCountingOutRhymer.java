package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	
	private static final int sizeOfRhymer = 12;

	private static final int defaultNumber = 1;

	private int[] rhymerArray = new int[sizeOfRhymer];

	private int total = -defaultNumber;

	void countIn(int in) {
		if (!isFull())
			rhymerArray[++total] = in;
	}

	boolean callCheck() {
		return total == -1;
	}

	boolean isFull() {
		return total == 11;
	}

	int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return rhymerArray[total];
	}

	int countOut() {
		if (callCheck())
			return -1;
		return rhymerArray[total--];
	}

}
