package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacklist.IntArrayStack;

public class FIFORhymer extends IntArrayStack {

	private IntArrayStack temp = new IntArrayStack();

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
