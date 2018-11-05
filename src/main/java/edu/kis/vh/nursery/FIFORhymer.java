package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private Stack temp = new IntArrayStack();

    public FIFORhymer(Stack list) {
        super(list);
    }

    @Override
    protected int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
//najlepszym wyborem jest IntArrayStack, poniewaz portrzebujemy ostatniej wartosci,

}
