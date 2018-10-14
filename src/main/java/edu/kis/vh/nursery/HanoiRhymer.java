package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int defalutRejected = 0;
	private int totalRejected = defalutRejected;

	int reportRejected() {
		return totalRejected;
	}

	@Override
	void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
