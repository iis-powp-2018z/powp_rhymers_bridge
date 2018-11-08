package edu.kis.vh.nursery;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;
	 public HanoiRhymer(IntLinkedList list) {
	        super(list);
	    }
	  public HanoiRhymer() {
	    }

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
