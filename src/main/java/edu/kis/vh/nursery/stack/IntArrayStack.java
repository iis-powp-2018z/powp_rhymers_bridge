package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stacker {

    private static final int MAX_STACK = 12;
    private static final int INIT_EMPTY_STACK = -1;
    private int[] NUMBERS = new int[MAX_STACK];
    private int total = INIT_EMPTY_STACK;

    @Override
    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == INIT_EMPTY_STACK;
    }

    @Override
    public boolean isFull() {
        return total == (MAX_STACK -1);
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
