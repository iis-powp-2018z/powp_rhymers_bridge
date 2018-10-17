package edu.kis.vh.nursery.collections;

public class IntArrayCollection implements CollectionImpl {

    private static final int STACK_CAPACITY = 12;
    private static final int STACK_FULL_VALUE = 11;

    private final int[] NUMBERS = new int[STACK_CAPACITY];
    private int total = EMPTY_COLLECTION_VALUE;

    @Override
    public void push(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_COLLECTION_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == STACK_FULL_VALUE;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_COLLECTION_VALUE;
        }
        return NUMBERS[total--];
    }

    @Override
    public int getSize() {
        return total;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_COLLECTION_VALUE;
        }
        return NUMBERS[total];
    }
}
