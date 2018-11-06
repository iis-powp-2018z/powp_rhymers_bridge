package edu.kis.vh.nursery;

public class IntArrayStack {
	
	private int testEncapsulateFilled = 0;
	
	private static final int EMPTY_STACK_FAIL = -1;

	private int[] NUMBERS = new int[12];

	private int total = EMPTY_STACK_FAIL; 

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_FAIL;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int peekaBoo() {
		if (callCheck())
			return EMPTY_STACK_FAIL;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_FAIL;
		return NUMBERS[total--];
	}

	public int getTestEncapsulateFilled() {
		return testEncapsulateFilled;
	}

	public void setTestEncapsulateFilled(int testEncapsulateFilled) {
		this.testEncapsulateFilled = testEncapsulateFilled;
	}

}


