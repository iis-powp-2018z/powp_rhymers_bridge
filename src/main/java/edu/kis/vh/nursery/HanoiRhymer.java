package edu.kis.vh.nursery;

/**
 * @author Marta
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;
	
	public int reportRejected() {
		return totalRejected;
	}
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}

}
