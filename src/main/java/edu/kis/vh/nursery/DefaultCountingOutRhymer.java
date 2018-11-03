package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int FULL = 11;
    private static final int EMPTY = -1;
    private int[] numbers = new int[getCAPACITY()];



    private int total = getEMPTY();

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getFULL() {
        return FULL;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == getEMPTY();
    }

    protected boolean isFull() {
        return total == getFULL();
    }

    protected int peekaboo() {
        if (callCheck())
            return getEMPTY();
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return getEMPTY();
        return numbers[total--];
    }

}
