package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers;

    public int stackSize = -1;

    public defaultCountingOutRhymer() {
        numbers = new int[12];
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++stackSize] = in;
    }

    public boolean isEmpty() {
        return stackSize == -1;
    }

    public boolean isFull() {
        return stackSize == 11;
    }

    protected int peekaboo() {
        if (isEmpty())
            return -1;
        return numbers[stackSize];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[stackSize--];
    }

}
