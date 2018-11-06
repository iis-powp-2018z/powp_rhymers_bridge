package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	
	private IntLinkedList intLinkList =  new IntLinkedList();
	public int total = -1;
	private IntArrayStack  intArrStk = new IntArrayStack();
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkList) {
		super();
		this.intArrStk = intArrStk;
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
	/*
	protected int peekaboo() {

		if (callCheck())
			return -1;

		return intLinkList.

	}
	
	*
	public int getTotal() {
		return intArrStk.getTotal();
	}

	//public void countIn(int in) {
	//	intArrStk.countIn(in);
	//}
/*
	public boolean callCheck() {
		return intArrStk.callCheck();
	}

	public boolean isFull() {
		return intArrStk.isFull();
	}

	public int countOut() {
		return intArrStk.countOut();
	}
/*
	public int peekaBoo() {
		return intArrStk.peekaBoo();
	}
*/
	public int getTestEncapsulateFilled() {
		return intArrStk.getTestEncapsulateFilled();
	}

	public void setTestEncapsulateFilled(int testEncapsulateFilled) {
		intArrStk.setTestEncapsulateFilled(testEncapsulateFilled);
	}
	
}
