package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_STACK = 12;
    private static final int INIT_EMPTY_STACK = -1;
    private int[] NUMBERS = new int[MAX_STACK];

    public int total = INIT_EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INIT_EMPTY_STACK;
    }

    public boolean isFull() {
        return total == (MAX_STACK -1);
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
