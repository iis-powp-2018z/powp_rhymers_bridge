package edu.kis.vh.nursery.collections;

public class IntArrayStack {

    private static final int STACK_CAPACITY = 12;
    private static final int FULL = 11;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY;
    }

    protected boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
