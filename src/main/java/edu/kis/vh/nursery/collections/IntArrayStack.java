package edu.kis.vh.nursery.collections;

public class IntArrayStack implements IntStackImplementation{

    private static final int STACK_CAPACITY = 12;
    private static final int FULL = 11;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return total == FULL;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY;
        }
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY;
        return numbers[total--];
    }

    @Override
    public int getSize() {
        return total;
    }

    public int peekaboo() {
        if (callCheck())
            return 0;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
