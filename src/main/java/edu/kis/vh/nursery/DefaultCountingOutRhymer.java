package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
	private static final int NUMBER_OF_ELEMENTS = 12;
	private static final int MAX_CAPACITY = 11;

	private int[] numbers = new int[NUMBER_OF_ELEMENTS];
	private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }
}
