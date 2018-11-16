package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer(IntLinkedList intStackImplementation, int totalRejected) {
        super(intStackImplementation);
        this.totalRejected = totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Alt + strzałka przeskakuje pomiędzy ostatnio edytowanymi onkami

