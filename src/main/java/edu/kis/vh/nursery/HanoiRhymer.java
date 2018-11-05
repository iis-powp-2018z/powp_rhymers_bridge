package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Stack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer() {

    }

    public HanoiRhymer(Stack list)
    {
        super(list);
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
