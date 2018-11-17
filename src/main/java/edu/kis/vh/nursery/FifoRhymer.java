package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementsStack.IntLinkedList;

public class FifoRhymer extends DefaultCountingOutRhymer {

	// wg mnie najlepszy będzie IntLinkedList
	private Stack temp;

	public FifoRhymer() {
		super();
		this.temp = new IntLinkedList();
	}

	public FifoRhymer(Stack stack) {
		super(stack);
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
