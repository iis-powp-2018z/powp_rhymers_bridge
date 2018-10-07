package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int NUMBER_ARRAY_SIZE = 12;
    private static final int ERROR = -1;
    private static final int FULL = NUMBER_ARRAY_SIZE - 1;

    private int[] numbers = new int[NUMBER_ARRAY_SIZE];
    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekABoo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }
}
