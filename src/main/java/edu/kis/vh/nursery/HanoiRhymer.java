package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     *
     */
    private static final int INT = 0;
    private int totalRejected = INT;

    /**
     *
     * @return Returns the {@code int} of totalRejected
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * Checking if method: callCheck is false and input argument is greater than method: peekaboo
     * if statement is true then {@code int} totalRejected is incremented
     * if statement is false calls method: countIn from DefaultCountingOutRhymer class with input parameter
     * @param in {@code int} to compare with function: peekaboo()
     */
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//alt + -> zmienia okno odpowiednio w prawo lub lewo