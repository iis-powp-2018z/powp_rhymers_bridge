package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            rhymer.countIn(super.countOut());

        int counter = rhymer.countOut();

        while (!rhymer.callCheck())

            countIn(rhymer.countOut());

        return counter;
    }
}
