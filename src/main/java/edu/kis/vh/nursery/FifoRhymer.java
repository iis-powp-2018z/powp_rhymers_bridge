package edu.kis.vh.nursery;

import stack.IntLinkedList;

/**
 * @author Kamila
 *
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	public FifoRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FifoRhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
		// TODO Auto-generated constructor stub
	}

	public DefaultCountingOutRhymer temp = new HanoiRhymer();

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
