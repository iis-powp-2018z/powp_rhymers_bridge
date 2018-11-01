package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int stackCapacity = 12;
    private static final int initialValue = -1;
    private static final int fullStack = 11;

    private int[] rhymerArray = new int[stackCapacity];
    private int total = initialValue;

    public int getTotal() {
        return total;
    }
    void countIn(int in) {
        if (!isFull())
            rhymerArray[++total] = in;
    }
    boolean callCheck() {
        return total == initialValue;
    }
    boolean isFull() {
        return total == fullStack;
    }
    int peekaboo() {
        if (callCheck()) {
            return initialValue;
        }
        return rhymerArray[total];
    }
    int countOut() {
        if (callCheck())
            return -1;
        return rhymerArray[total--];
    }
}
