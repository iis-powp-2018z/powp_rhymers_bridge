package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejectedCounter = 0;

    public HanoiRhymer() {
        super();
    }

    public int reportRejected() {
        return totalRejectedCounter;
    }

    public void countIn(int input) {
        if (!isEmpty() && input > peekaboo())
            totalRejectedCounter++;
        else
            super.countIn(input);
    }
}
