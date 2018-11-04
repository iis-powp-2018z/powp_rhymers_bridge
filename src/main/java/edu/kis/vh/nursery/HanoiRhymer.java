package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intstack.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntStack intStack) {
        super(intStack);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekABoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}