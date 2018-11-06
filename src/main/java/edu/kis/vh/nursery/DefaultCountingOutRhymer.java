package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private IntArrayStack  intArrStk = new IntArrayStack();
	
	public DefaultCountingOutRhymer(IntArrayStack intArrStk) {
		super();
		this.intArrStk = intArrStk;
	}
	
	public DefaultCountingOutRhymer() {
		
	}
	
	
	
	public int getTotal() {
		return intArrStk.getTotal();
	}

	public void countIn(int in) {
		intArrStk.countIn(in);
	}

	public boolean callCheck() {
		return intArrStk.callCheck();
	}

	public boolean isFull() {
		return intArrStk.isFull();
	}

	public int countOut() {
		return intArrStk.countOut();
	}

	public int peekaBoo() {
		return intArrStk.peekaBoo();
	}

	public int getTestEncapsulateFilled() {
		return intArrStk.getTestEncapsulateFilled();
	}

	public void setTestEncapsulateFilled(int testEncapsulateFilled) {
		intArrStk.setTestEncapsulateFilled(testEncapsulateFilled);
	}
	
	


	
	
	/*
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

	protected int peekaBoo() {
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
	*/




}
