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

	public IntStack temp = new IntStack();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.push(super.countOut());

		final int ret = temp.pop();

		while (!temp.isEmpty())

			countIn(temp.pop());

		return ret;
	}
}
