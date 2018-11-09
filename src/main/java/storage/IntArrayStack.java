package storage;

import edu.kis.vh.nursery.Generate;

public class IntArrayStack implements Generate {
	
	private int testEncapsulateFilled = 0;
	
	private int[] NUMBERS = new int[12];

	private int total = IntLinkedList.EMPTY_STACK_FAIL; 

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == IntLinkedList.EMPTY_STACK_FAIL;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int peekaBoo() {
		if (callCheck())
			return IntLinkedList.EMPTY_STACK_FAIL;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return IntLinkedList.EMPTY_STACK_FAIL;
		return NUMBERS[total--];
	}

	public int getTestEncapsulateFilled() {
		return testEncapsulateFilled;
	}

	public void setTestEncapsulateFilled(int testEncapsulateFilled) {
		this.testEncapsulateFilled = testEncapsulateFilled;
	}

}


