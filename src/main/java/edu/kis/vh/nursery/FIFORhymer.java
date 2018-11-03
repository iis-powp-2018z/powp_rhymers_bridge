package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.StackImplementation;
import edu.kis.vh.nursery.collections.IntLinkedList;
public class FIFORhymer extends DefaultCountingOutRhymer {

	private final StackImplementation stackImplementation = new IntLinkedList();
	
	public FIFORhymer(String string) {
		super(string);
	}

	public FIFORhymer() {
		super();
	}

	@Override
	protected int countOut() {
		while (!callCheck())
			stackImplementation.push(super.countOut());

		int ret = stackImplementation.pop();

		while (!stackImplementation.isEmpty())
			countIn(stackImplementation.pop());

		return ret;
	}
}
