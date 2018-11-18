package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack {

    private static final int LAST_INDEX = 11;
    private static final int STACK_CAPACITY = 12;
    private int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY_STACK;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_STACK;
    }

    @Override
    public boolean isFull() {
        return total == LAST_INDEX;
    }

    @Override
    public int peeKaBoo() {
        if (callCheck())
            return EMPTY_STACK;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK;
        return numbers[total--];
    }

}
