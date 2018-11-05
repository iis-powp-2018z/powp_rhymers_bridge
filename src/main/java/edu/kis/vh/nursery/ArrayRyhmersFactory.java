package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.Rhymersfactory;

public class ArrayRyhmersFactory implements Rhymersfactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		// TODO Auto-generated method stub
		return new HanoiRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		// TODO Auto-generated method stub
		return new FifoRhymer();
	}

}
