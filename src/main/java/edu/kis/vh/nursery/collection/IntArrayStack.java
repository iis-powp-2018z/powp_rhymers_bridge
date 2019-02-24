package edu.kis.vh.nursery.collection;

public class IntArrayStack implements Stack {

	int total = INITIAL_VALUE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#push(int)
	 */
	@Override
	public void push(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == INITIAL_VALUE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == CHECK_FULL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return INITIAL_VALUE;
		return NUMBERS[total];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.kis.vh.nursery.Stack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return INITIAL_VALUE;
		return NUMBERS[total--];
	}

}
