package edu.kis.vh.nursery;

import storage.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HanoiRhymer(IntLinkedList intLinkList) {
		super(intLinkList);
		// TODO Auto-generated constructor stub
	}
	private int totalRejected = 0;
	
	public int reportRejected() {
		return totalRejected;
	}
	 @Override 
	public void countIn(int in) {
		if (!callCheck() && in > peekaBoo())
			totalRejected++;
		else
			super.countIn(in);
	} 
}
// Kombinacje alt + stałka umożliwiają przejscie pomiedzy oknami edytora 