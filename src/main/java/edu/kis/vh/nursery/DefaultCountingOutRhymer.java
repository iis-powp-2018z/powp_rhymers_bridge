package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;


public class DefaultCountingOutRhymer {
	protected Stack list;

	public DefaultCountingOutRhymer() {
		this.list = list;
	}
	public DefaultCountingOutRhymer(IntLinkedList list) {
		this.list = list;
	}
	public void countIn(int in) {
		list.push(in);
	}
	public boolean callCheck() {
		return list.isEmpty();
	}
	public boolean isFull() {
		return list.isFull();
	}
	public int peekaboo() {
		return list.top();
	}
	public int countOut() {
		return list.pop();
	}
	
	}
	
 
 