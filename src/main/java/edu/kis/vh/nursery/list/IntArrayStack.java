package edu.kis.vh.nursery.list;

public class IntArrayStack implements Stack {

    private static final int EMPTY_STACK_ = -1;
    private static final int LAST_INDEX = 11;
    private static final int STACK_CAPACITY = 12;
    private int[] numbers = new int[STACK_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_STACK_;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_STACK_;
    }

    @Override
    public boolean isFull() {
        return total == LAST_INDEX;
    }

    @Override
    public int peeKaBoo() {
        if (callCheck())
            return EMPTY_STACK_;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_;
        return numbers[total--];
    }

}
