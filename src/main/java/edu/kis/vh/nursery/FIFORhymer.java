package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

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
