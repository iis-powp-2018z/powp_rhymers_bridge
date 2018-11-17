package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.stack.Stacker;

public class RhymersTest {

    static final int EMPTY_STACK_VALUE = Stacker.INIT_EMPTY_STACK;
    static final int TEST_VALUE = 4;
    static final int STACK_CAPACITY = 11;
    static final int TEST_VALUE_2 = 1;

    RhymersFactory rhymersFactory;

    public RhymersTest(RhymersFactory rhymersFactory) {
        this.rhymersFactory = rhymersFactory;
    }

}
