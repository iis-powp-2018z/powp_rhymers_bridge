package edu.kis.vh.nursery;

import storage.IntLinkedList;
import storage.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntLinkedList intLinkList) {
		super(intLinkList);
		// TODO Auto-generated constructor stub
	}

	//Wybrany zosstał stos gdyż najlepeiej implementuje mechanizm FIFO
	final private Generate temp = new IntArrayStack();
	

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * Here are details regrding class DefaultCountingOutRhymer
	 * class included public method countOut()
	 * class extends DefaultCountingOutRhymer
	 */
	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut()); 

		final int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
