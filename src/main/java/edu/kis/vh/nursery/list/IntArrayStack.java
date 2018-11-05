package edu.kis.vh.nursery.list;

public class IntArrayStack {
    public static final int DEFAULT_STACK_CAPACITY = 12;
    public static final int DEFAULT_MIN = -1;
    private int[] NUMBERS = new int[DEFAULT_STACK_CAPACITY];

    private int getTotal() {
        return total;
    }

    private int total = DEFAULT_MIN;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == DEFAULT_STACK_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
