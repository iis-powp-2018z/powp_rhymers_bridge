package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer("list");

	public FIFORhymer(String type) {
		super(type);
	}

	public FIFORhymer() {
		super();
	}

	@Override
	protected int countOut() {
		while (!callCheck()) {
			rhymer.countIn(super.countOut());
		}

		int ret = rhymer.countOut();

		while (!rhymer.callCheck()) {
			countIn(rhymer.countOut());
		}
		
		return ret;
	}
}
