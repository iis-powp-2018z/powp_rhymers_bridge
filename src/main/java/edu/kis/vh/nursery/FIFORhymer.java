package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer("list");

	public FIFORhymer(String string) {
		super(string);
	}

	public FIFORhymer() {
		super();
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
