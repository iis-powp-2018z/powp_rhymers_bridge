package edu.kis.vh.nursery;

import stack.IntLinkedList;

/**
 * @author Kamila
 *
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

	public FifoRhymer() {
		
	}

	public FifoRhymer(IntLinkedList list) {
		super(list);
		
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
