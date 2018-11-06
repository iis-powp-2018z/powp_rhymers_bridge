package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	
	private IntLinkedList intLinkList =  new IntLinkedList();
	public int total = -1;
	private IntArrayStack  intArrStk = new IntArrayStack();
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkList) {
		super();
		this.intLinkList = intLinkList;
	}
	
	public DefaultCountingOutRhymer() {
		
	}

	public void countIn(int in) {
		if (!intLinkList.isFull())
			intLinkList.push(in);
	}
	
	public boolean callCheck() {
		return intLinkList.isEmpty();
	}
	
	public boolean isFull() {
		return intLinkList.isFull();
	}
	
	protected int peekaBoo() {

		if (callCheck())
			return -1;
		return intLinkList.top();
	}
	
	public int countOut() {
		if (callCheck())
			return -1;
		return intLinkList.pop();

	}
}
