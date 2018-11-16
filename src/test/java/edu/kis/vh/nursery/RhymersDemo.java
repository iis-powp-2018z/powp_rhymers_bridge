package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.Arrays;
import java.util.Random;

class RhymersDemo {

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		testRhymers(rhymers);

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
		
	}

	private static void testRhymers(DefaultCountingOutRhymer[] rhymers) {
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		Random rn = new Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

        Arrays.stream(rhymers).forEach(rhymer -> {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        });
	}

}