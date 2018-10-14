package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	protected int reportRejected() {
		return totalRejected;
	}

	protected void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}
}
