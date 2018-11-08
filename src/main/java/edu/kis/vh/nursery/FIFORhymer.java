package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();	// TODO parent object definition is not needed

    @Override
    public int countOut() {
        while (!callCheck())

            rhymer.countIn(super.countOut());	// TODO I think braces (parentheses) need to be used here

        final int counter = rhymer.countOut();	

        while (!rhymer.callCheck())

            countIn(rhymer.countOut());	// TODO I think braces (parentheses) need to be used here

        return counter;
    }
}
