package edu.kis.vh.nursery;

import stack.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;
	
	public HanoiRhymer(IntLinkedList list) {
        super(list);
    }
	public HanoiRhymer() {
    }

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
