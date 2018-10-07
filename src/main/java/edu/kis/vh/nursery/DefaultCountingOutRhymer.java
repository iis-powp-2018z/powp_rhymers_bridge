package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EOF = -1;
    public static final int LAST_INDEX = 11;
    private int[] numbers = new int[12];

    public int total = EOF;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EOF;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peeKaBoo() {
        if (callCheck())
            return EOF;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EOF;
        return numbers[total--];
    }
}

