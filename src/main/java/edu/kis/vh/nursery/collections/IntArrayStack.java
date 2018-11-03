package edu.kis.vh.nursery.collections;

public class IntArrayStack implements StackImplementation {

	private int[] rhymerArray = new int[STACK_CAPACITY];
	private int total = EMPTY_STACK;

	@Override
	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}
	
	@Override
	public void push(int i) {
		if (!isFull())
			rhymerArray[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK;
		}
		return rhymerArray[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return rhymerArray[total--];
	}

	@Override
	public int getSize() {
		return total;
	}

}
