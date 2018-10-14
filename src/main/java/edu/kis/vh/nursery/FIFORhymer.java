package edu.kis.vh.nursery;

public class FIFORhymer extends RhymerCounting {

	public RhymerCounting rhymer = new RhymerCounting();

	@Override
	public int countOut() {
		while (!callCheck())
			rhymer.countIn(super.countOut());

		int ret = rhymer.countOut();

		while (!rhymer.callCheck())
			countIn(rhymer.countOut());

		return ret;
	}
}
