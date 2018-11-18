package edu.kis.vh.nursery.collection;

import edu.kis.vh.nursery.IntStack;

public class IntArrayStack implements IntStack{
	private static final int STACK_CAPACITY = 12;

	private static final int EMPTY_STACK_ERROR = 0;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_ERROR;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_ERROR;
	}
	@Override
	public boolean isFull() {
		return total == 11;
	}

	public int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_ERROR;
		return numbers[total--];
	}

	@Override
    public void push(int number) {
        if (!isFull()) {
            numbers[++total] = number;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_ERROR;
        }
        return numbers[total--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return EMPTY_STACK_ERROR;
        }
        return numbers[total];
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_ERROR;
    }
}
