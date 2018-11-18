package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private Stack temp = new IntLinkedList();

    public FIFORhymer(Stack stack) {
        super(stack);
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
