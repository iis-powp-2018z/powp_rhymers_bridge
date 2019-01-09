package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int full = 11;
    public static final int wrongVal = -1;
    private int[] NUMBERS = new int[12];

    public int total = wrongVal;

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

}
