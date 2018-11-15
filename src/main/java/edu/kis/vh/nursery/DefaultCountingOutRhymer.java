package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.StackImplementation;

public class DefaultCountingOutRhymer 	{


	StackImplementation stackImplementation;



	public DefaultCountingOutRhymer(StackImplementation intLinkedlist) {
		this.stackImplementation = intLinkedlist;
	}
	
	
	public DefaultCountingOutRhymer() {
		stackImplementation = new IntLinkedList();
	}
	
	
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		// TODO Auto-generated constructor stub
	}


	public void countIn(int i) {
		stackImplementation.push(i);
	}

	protected boolean callCheck() {		
		return stackImplementation.isEmpty();
	}

	boolean isFull() {		
		return stackImplementation.isFull();
	}

	protected int peekaboo() {	
		return stackImplementation.top();
	}

	public int countOut() {
		return stackImplementation.pop();
	}
	
	public int getTotal() {
		return stackImplementation.getTotal();
		
	}
	
	
}
