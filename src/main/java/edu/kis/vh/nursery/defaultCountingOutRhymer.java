package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int STACK_SIZE = 15;
    private static final int STACK_EMPTY = -1;
    private int pointer = STACK_EMPTY;

    private int[] numbers;

    public defaultCountingOutRhymer() {
        numbers = new int[STACK_SIZE];
    }

    private int getPointer() {
        return pointer;
    }

    public void countIn(int input) {
        if (!isFull())
            numbers[++pointer] = input;
    }

    boolean isEmpty() {
        return getPointer() == STACK_EMPTY;
    }

    boolean isFull() {
        return getPointer() == STACK_SIZE - 1;
    }

    int peekaboo() {
        if (isEmpty())
            return -1;
        return numbers[getPointer()];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[pointer--];
    }

}
