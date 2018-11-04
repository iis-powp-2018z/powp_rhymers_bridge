package edu.kis.vh.nursery;

public class IntArrayStack extends Adapter {
	
	private static final int empty_stack = -1;
	private static final int full_stack = 11;
	private static final int stack_capacity = 12;

	private int[] NUMBERS = new int[stack_capacity];

	private int total = empty_stack;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#getTotal()
	 */
	@Override
	public int getTotal()
	{
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#countIn(int)
	 */
	@Override
	public void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == empty_stack;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == full_stack;
	}

	protected int peekaboo() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total--];
	}

}
