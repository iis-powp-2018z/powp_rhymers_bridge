package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_STACK = 12;
    private static final int INIT_EMPTY_STACK = -1;
    private int[] NUMBERS = new int[MAX_STACK];

    private int total = INIT_EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == INIT_EMPTY_STACK;
    }

    boolean isFull() {
        return total == (MAX_STACK -1);
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
