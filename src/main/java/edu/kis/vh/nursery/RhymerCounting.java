package edu.kis.vh.nursery;

public class RhymerCounting {

	private int[] rhymerArray = new int[12];

	public int total = -1;

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
