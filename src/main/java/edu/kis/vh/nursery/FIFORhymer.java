package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final private Generate temp = new DefaultCountingOutRhymer();

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultCountingOutRhymer#countOut()
	 * Here are details regrding class DefaultCountingOutRhymer
	 * class included public method countOut()
	 * class extends DefaultCountingOutRhymer
	 */
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
