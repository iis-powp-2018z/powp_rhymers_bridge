package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import org.jetbrains.annotations.NotNull;

class RhymersDemo {

	public static void main(String[] args) {
        DefaultCountingOutRhymer[] rhymers = rhymersFactory();
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
		
	}

    @NotNull
    private static DefaultCountingOutRhymer[] rhymersFactory() {
        Rhymersfactory factory = new DefaultRhymersFactory();

        return new DefaultCountingOutRhymer[]{factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
    }

}