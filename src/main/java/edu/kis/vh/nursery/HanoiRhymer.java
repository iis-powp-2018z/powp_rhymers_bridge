package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int STARTING_VALUE = 0;
    int totalRejected = STARTING_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peeKaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}





