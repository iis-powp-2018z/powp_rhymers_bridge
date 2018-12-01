package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class IntLinkedListFactory implements Rhymersfactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

}
