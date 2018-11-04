package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    public static final int TEST_VALUE = 4;
    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_STACK_VALUE = -1;

    @Test
    protected void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    protected void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    protected void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    protected void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    protected void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
        rhymer.countIn(TEST_VALUE);
        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
//kombinacja alt + strzalka pozwala nam sie przelaczaj pomiedzy kartami klas
}
