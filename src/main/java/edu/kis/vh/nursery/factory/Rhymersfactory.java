package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.RhymerCounting;

public interface Rhymersfactory {

	public RhymerCounting GetStandardRhymer();

	public RhymerCounting GetFalseRhymer();

	public RhymerCounting GetFIFORhymer();

	public RhymerCounting GetHanoiRhymer();

}
