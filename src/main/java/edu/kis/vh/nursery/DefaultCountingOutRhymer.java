package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	
	private static final int sizeOfRhymer = 12;

	private static final int defaultNumber = 1;

	private int[] rhymerArray = new int[sizeOfRhymer];

	public int total = -defaultNumber;

	public void countIn(int in) {
		if (!isFull())
			rhymerArray[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return rhymerArray[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return rhymerArray[total--];
	}

}
