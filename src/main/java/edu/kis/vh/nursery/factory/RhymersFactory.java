package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	DefaultCountingOutRhymer GetFIFORhymer();

	DefaultCountingOutRhymer GetStandardRhymer();

	DefaultCountingOutRhymer GetFalseRhymer();

	DefaultCountingOutRhymer GetHanoiRhymer();

	}