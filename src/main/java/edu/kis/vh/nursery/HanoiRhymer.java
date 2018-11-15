package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.StackImplementation;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int TOTAL_REJECTED_VALUE = 0;
	private int totalRejected = TOTAL_REJECTED_VALUE;

	public HanoiRhymer(StackImplementation stackImplementation) {
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntArrayStack intArrayStack) {
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer() {
		// TODO Auto-generated constructor stub
	}

	protected int reportRejected() {
		return totalRejected;
	}

	public void reportRejected(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
