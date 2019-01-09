package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int full = 11;
    private static final int wrongVal = -1;
    private int[] NUMBERS = new int[12];

    private int total = wrongVal;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == wrongVal;
    }

    public boolean isFull() {
        return total == full;
    }

    protected int peekaboo() {
        if (callCheck())
            return wrongVal;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return wrongVal;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
