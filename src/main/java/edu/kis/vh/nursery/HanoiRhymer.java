package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;
	protected int reportRejected() {
		return totalRejected;
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countIn(int)
	 */
	@Override
	protected void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(in);
		}
	}
}
