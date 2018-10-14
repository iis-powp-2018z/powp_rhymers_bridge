package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.RhymerCounting;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public RhymerCounting GetStandardRhymer() {
		return new RhymerCounting();
	}

	@Override
	public RhymerCounting GetFalseRhymer() {
		return new RhymerCounting();
	}

	@Override
	public RhymerCounting GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public RhymerCounting GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
