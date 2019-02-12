package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private Stack temp = new IntLinkedList();

    public FIFORhymer(Stack stack) {
        super(stack);
    }

    public FIFORhymer(){
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }
}
