package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer 	{


	IntLinkedList linkedList;



	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		this.linkedList = linkedList;
	}
	
	
	public DefaultCountingOutRhymer() {
		linkedList = new IntLinkedList();
	}
	
	
	public void countIn(int i) {
		linkedList.push(i);
	}

	protected boolean callCheck() {		
		return linkedList.isEmpty();
	}

	boolean isFull() {		
		return linkedList.isFull();
	}

	protected int peekaboo() {	
		return linkedList.top();
	}

	public int countOut() {
		return linkedList.pop();
	}
	
	public int getTotal() {
		return linkedList.getTotal();
		
	}
	
	
}
