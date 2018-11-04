package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

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
// alt + '<-' / '->' służy do nawigacji po edytowanych miejscach (intelij)