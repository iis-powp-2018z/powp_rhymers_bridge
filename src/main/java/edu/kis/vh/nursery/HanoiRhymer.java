package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejectedCounter = 0;

    public int reportRejected() {
        return totalRejectedCounter;
    }

    public void countIn(int in) {
        if (!isEmpty() && in > peekaboo())
            totalRejectedCounter++;
        else
            super.countIn(in);
    }
}
