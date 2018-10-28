package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;// tutaj 3.1.1

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())// tutaj 3.1.1
			totalRejected++;
		else // tutaj 3.1.1
			super.countIn(in);// tutaj 3.1.1
	}
}
//alt + -> przechodzi do kolejnego z otwieranych plików <- analogicznie do poprzedniego 3.1.3