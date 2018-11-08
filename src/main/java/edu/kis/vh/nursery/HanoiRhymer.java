package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;	// TODO I think braces (parentheses) need to be used here
        else
            super.countIn(in);	// TODO I think braces (parentheses) need to be used here
    }
}
