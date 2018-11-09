package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.Generate;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {
	
	@Override
	public Generate GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public Generate GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public Generate GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public Generate GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
