package edu.kis.vh.nursery.collections;

public class IntArrayStack implements Stack{

    private static final int STACK_CAPACITY = 12;
    private static final int FULL_STACK = 11;

    private int[] rhymerArray = new int[STACK_CAPACITY];
    private int total = INITIAL_VALUE;

    public int getTotal() {
        return total;
    }

    public void push(int in) {
        if (!isFull())
            rhymerArray[++total] = in;
    }

    public boolean isEmpty() {
        return total == INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK;
    }

    public int top() {
        if (isEmpty()) {
            return INITIAL_VALUE;
        }
        return rhymerArray[total];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        return rhymerArray[total--];
    }
}
