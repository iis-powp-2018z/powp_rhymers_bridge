package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FifoRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FifoRhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
