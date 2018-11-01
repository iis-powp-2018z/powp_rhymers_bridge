package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejectedCounter = 0;

    public HanoiRhymer() {
        super();
    }

    int reportRejected() {
        return totalRejectedCounter;
    }

    public void countIn(int input) {
        if (!isEmpty() && input > peekaboo())
            totalRejectedCounter++;
        else
            super.countIn(input);
    }
}
