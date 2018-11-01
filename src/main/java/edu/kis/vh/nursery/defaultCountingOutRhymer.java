package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int STACK_SIZE = 15;
    public static final int STACK_EMPTY = -1;

    private int[] numbers;
    private int pointer = STACK_EMPTY;

    public defaultCountingOutRhymer() {
        numbers = new int[STACK_SIZE];
    }

    public void countIn(int input) {
        if (!isFull())
            numbers[++pointer] = input;
    }

    public boolean isEmpty() {
        return pointer == STACK_EMPTY;
    }

    public boolean isFull() {
        return pointer == STACK_SIZE - 1;
    }

    protected int peekaboo() {
        if (isEmpty())
            return -1;
        return numbers[pointer];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[pointer--];
    }

}
