package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
	private final int testValue = 4;

    @Test
    public void testCountIn() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(testValue);

        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(testValue);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testGetTotal() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int numberOfInsertions = 4;
        final int highestExistingIndex = numberOfInsertions - 1;

        for (int i = 0; i < numberOfInsertions; i++) {
            rhymer.countIn(testValue);
        }

        Assert.assertEquals(highestExistingIndex, rhymer.getTotal());
    }

    @Test
    public void testIsFull() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            final boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(testValue);
        }

        final boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
}
