package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stacker {

    private int[] NUMBERS = new int[MAX_STACK_SIZE];
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
        return total == (MAX_STACK_SIZE -1);
    }

    @Override
    public int top() {
        if (isEmpty())
            return INIT_EMPTY_STACK;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return INIT_EMPTY_STACK;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
