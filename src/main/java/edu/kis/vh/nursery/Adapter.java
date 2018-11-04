package edu.kis.vh.nursery;

public class Adapter implements DefaultInterface {
	
	protected static final int EMPTY = -1;
	protected static final int NEW_EMPTY = 0;
	protected static final int FULL = 11;
	protected static final int CAPITALITY = 12;
	
	public int getTotal() {return 0;}
	public void countIn(int in) {}
	public boolean callCheck() {return false;}
	public boolean isFull() {return false;}
	public int countOut() {return 0;}
	public void push(int i) {}
	public boolean isEmpty() {return false;}
	public int top() {return 0;}
	public int pop() {return 0;}
	public int getI() {return 0;}

}
