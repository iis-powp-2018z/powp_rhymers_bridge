package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 	{

	IntArrayStack arrayStack;
	
	void arrayStack(){
		
	}

	public DefaultCountingOutRhymer(IntArrayStack arrayStack) {
		this.arrayStack = arrayStack;
	}


	public DefaultCountingOutRhymer() {
		arrayStack = new IntArrayStack();
	}


	public void countIn(int in) {
		arrayStack.countIn(in);
	}

	protected boolean callCheck() {
		return arrayStack.callCheck();
	}

	public boolean isFull() {
		return arrayStack.isFull();
	}

	protected int peekaboo() {
		return arrayStack.peekaboo();
	}

	public int countOut() {
		return arrayStack.countOut();
	}
	
	
	
	
}
