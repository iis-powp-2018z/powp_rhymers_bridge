package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

public class FifoRhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FifoRhymer(IntLinkedList intStackImplementation, DefaultCountingOutRhymer temp) {
        super(intStackImplementation);
        this.temp = temp;
    }

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        final int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }


}
