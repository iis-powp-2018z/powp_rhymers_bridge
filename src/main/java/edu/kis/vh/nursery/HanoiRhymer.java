package edu.kis.vh.nursery;

import java.util.Stack;

import edu.kis.vh.nursery.stacklist.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
		super();
	}
 	public HanoiRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}
	
	protected int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}
}

// Alt + strzalka przechodzi miedzy otwartymi pilkami