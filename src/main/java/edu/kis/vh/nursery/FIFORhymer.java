package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intstack.IntListStack;
import edu.kis.vh.nursery.intstack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntStack temp = new IntListStack();

    public FIFORhymer() {
    }

    public FIFORhymer(IntStack intStack) {
        super(intStack);
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.push(super.countOut());
        }

        final int ret = temp.pop();

        while (!temp.isEmpty()) {
            countIn(temp.pop());
        }

        return ret;
    }
}
