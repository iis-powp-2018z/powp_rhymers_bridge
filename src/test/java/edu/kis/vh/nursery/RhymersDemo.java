package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {
	// TODO: I think this class needs to be moved to src/main/java

    public static void main(final String[] args) {
        final RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory);
    }

    public static void testRhymers(final RhymersFactory factory) {
        final DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);	// TODO I think braces (parentheses) need to be used here
        final java.util.Random rn = new java.util.Random();

        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));	// TODO I think braces (parentheses) need to be used here

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())	// TODO I think braces (parentheses) need to be used here
                System.out.print(rhymers[i].countOut() + "  ");	// TODO I think braces (parentheses) need to be used here
            System.out.println();
        }

        System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).getTotalRejected());
    }
}