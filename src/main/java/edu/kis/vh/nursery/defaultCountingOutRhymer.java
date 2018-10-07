package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int TOTAL = -1;
    private static final int NUMBERS_COUNT = 12;
    private static final int FULL_NUMBER = 11;

    private int[] numbers = new int[NUMBERS_COUNT];

    private int total = TOTAL;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == TOTAL;
    }

    boolean isFull() {
        return total == FULL_NUMBER;
    }

    int peekaboo() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    //3.1.9 unused setter
//    public void setTotal(int total) {
//        this.total = total;
//    }
}
