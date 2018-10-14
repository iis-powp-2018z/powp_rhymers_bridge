package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_ERROR = -1;
    private static final int STACK_FULL = STACK_CAPACITY - 1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_ERROR;
    }

    public boolean isFull() {
        return total == STACK_FULL;
    }

    int peekABoo() {
        if (callCheck())
            return EMPTY_STACK_ERROR;
        return numbers[total];
    }
}
