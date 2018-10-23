package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	private static final int COLUMN_MAX = 3;
	private static final int COLUMN_FIRST = 0;
	private static final int LINE_MAX = 15;
	private static final int LINE_FIRST = 1;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer() };
		
		
		for (int i = LINE_FIRST; i < LINE_MAX; i++)
			for (int j = COLUMN_FIRST; j < COLUMN_MAX; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = LINE_FIRST; i < LINE_MAX; i++)
			rhymers[COLUMN_MAX].countIn(rn.nextInt(20));

		for (int i = COLUMN_FIRST; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[COLUMN_MAX]).reportRejected());

	}

}