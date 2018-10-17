package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(String type) {
		super(type);
	}

	public HanoiRhymer() {
		super();
	}

	int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(in);
		}
	}
}
