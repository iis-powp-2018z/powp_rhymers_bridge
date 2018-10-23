package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int TOTAL_START = 0;
	int totalRejected = TOTAL_START;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
