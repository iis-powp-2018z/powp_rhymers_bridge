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
	
}
