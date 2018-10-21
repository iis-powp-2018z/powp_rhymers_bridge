package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = -1;
    private static final int[] INTS = new int[12];
    private int[] numbers = INTS;

    private int total = INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == INT;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return INT;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;

        return numbers[total--];
    }
}