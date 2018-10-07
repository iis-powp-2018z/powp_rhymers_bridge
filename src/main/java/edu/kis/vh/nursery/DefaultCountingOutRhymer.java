package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EOF = -1;
    private static final int LAST_INDEX = 11;
    private static final int SIZE = 12;
    private int[] numbers = new int[SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EOF;

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

