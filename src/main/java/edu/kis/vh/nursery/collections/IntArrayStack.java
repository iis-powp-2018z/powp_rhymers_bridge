
package edu.kis.vh.nursery.collections;

public class IntArrayStack  {
    public static final int DEFAULT_STACK_CAPACITY = 12;
    public static final int DEFAULT_MIN = -1;
    private int[] NUMBERS = new int[DEFAULT_STACK_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_MIN;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == DEFAULT_STACK_CAPACITY - 1;
    }
    public int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }
}