package edu.kis.vh.nursery;

import stack.IntArrayStack;
import stack.IntLinkedList;

/**
 * @author Kamila
 *
 */
public class FifoRhymer extends DefaultCountingOutRhymer {
	
	private final Stack temp = new IntArrayStack();

	public FifoRhymer() {
		
	}

	public FifoRhymer(IntLinkedList list) {
		super(list);
		
	}

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
