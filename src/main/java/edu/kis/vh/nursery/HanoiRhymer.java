package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    protected void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Alt + strzałka przeskakuje pomiędzy ostatnio edytowanymi onkami

