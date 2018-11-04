package edu.kis.vh.nursery.intstack;

public class IntArrayStack implements IntStack {
    private static final int STACK_CAPACITY = 12;
    private static final int STACK_FULL = STACK_CAPACITY - 1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = -1;

    @Override
    public void push(int number) {
        if (!isFull()) {
            numbers[++total] = number;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_ERROR;
        }
        return numbers[total--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return EMPTY_STACK_ERROR;
        }
        return numbers[total];
    }

    @Override
    public boolean isEmpty() {
        return total < EMPTY_STACK_ERROR;
    }

    @Override
    public boolean isFull() {
        return total == STACK_FULL;
    }
}
