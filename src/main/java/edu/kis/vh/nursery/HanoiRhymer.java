package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.Stack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

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