package edu.kis.vh.nursery;
 public class IntArrayStack {
    private static final int NUMBERS_CAPACITY = 12;
    private static final int ARRAY_EMPTY = -1;
    private int[] numbers = new int[NUMBERS_CAPACITY];
     private int total = ARRAY_EMPTY;
     public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }
     protected boolean callCheck() {
        return total == ARRAY_EMPTY;
    }
     protected boolean isFull() {
        return total == NUMBERS_CAPACITY -1;
    }
     protected int peekaboo() {
        if (callCheck()) {
            return ARRAY_EMPTY;
        }
        return numbers[total];
    }
     public int countOut() {
        if (callCheck()) {
            return ARRAY_EMPTY;
        }
        return numbers[total--];
    }
     public int getTotal() {
        return total;
    }
}