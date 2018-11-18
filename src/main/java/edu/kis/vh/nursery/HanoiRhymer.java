package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int STARTING_VALUE = 0;
    int totalRejected = STARTING_VALUE;

    public HanoiRhymer() {
    }

    public HanoiRhymer(Stack stack) {
        super(stack);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peeKaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}





