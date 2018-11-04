package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    private static final int TEST_VALUE = 4;
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    public static int getTestValue() {
        return TEST_VALUE;
    }

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }

    public static int getEmptyStackValue() {
        return EMPTY_STACK_VALUE;
    }

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(getTestValue());

        int result = rhymer.peekaboo();
        Assert.assertEquals(getTestValue(), result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for (int i = 0; i < getStackCapacity(); i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(getEmptyStackValue(), result);

        rhymer.countIn(getTestValue());

        result = rhymer.peekaboo();
        Assert.assertEquals(getTestValue(), result);
        result = rhymer.peekaboo();
        Assert.assertEquals(getTestValue(), result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(getEmptyStackValue(), result);
        rhymer.countIn(getTestValue());
        result = rhymer.countOut();
        Assert.assertEquals(getTestValue(), result);
        result = rhymer.countOut();
        Assert.assertEquals(getEmptyStackValue(), result);
    }
//kombinacja alt + strzalka pozwala nam sie przelaczaj pomiedzy kartami klas
}
