package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;

/**
 * @author Damian Pytkowski
 *
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FIFORhymer(IntArrayStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
	private IntArrayStack temp = new IntArrayStack();
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * method calls countIn until callCheck is true
	 * returns: int
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
