package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stacker;

public class FIFORhymer extends DefaultCountingOutRhymer {

    //array stack is faster than list
    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer(Stacker stack) {
        super(stack);
    }

    public FIFORhymer() {
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
