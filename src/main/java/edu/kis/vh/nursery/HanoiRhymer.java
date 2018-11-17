package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stacker;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(Stacker stack) {
        super(stack);
    }

    public HanoiRhymer() {
    }

    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
