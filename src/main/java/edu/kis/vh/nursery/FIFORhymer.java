package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.StackImpementation;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(StackImpementation stackImplementation) {
		super(stackImplementation);
		// TODO Auto-generated constructor stub
	}

	@Override
	int countOut() {
		while (!callCheck())
			rhymer.countIn(super.countOut());

		int ret = rhymer.countOut();

		while (!rhymer.callCheck())
			countIn(rhymer.countOut());

		return ret;
	}
}
