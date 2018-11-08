package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerJUnitTest {
	private final int testValue = 4;

    @Test
    public void testCountIn() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        testCountInHelper(rhymer);
    }

    void testCountInHelper(DefaultCountingOutRhymer rhymer) {
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        Assert.assertEquals(true, rhymer.callCheck());
        rhymer.countIn(testValue);
        Assert.assertEquals(false, rhymer.callCheck());
    }

    @Test
    public void testGetTotal() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int numberOfInsertions = 4;	// insertions test number
        final int highestExistingIndex = numberOfInsertions - 1;

        for (int i = 0; i < numberOfInsertions; i++) {
            rhymer.countIn(testValue);
        }
        Assert.assertEquals(highestExistingIndex, rhymer.getTotal());
    }

    @Test
    public void testIsFull() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for (int i = 0; i < DefaultCountingOutRhymer.STACK_CAPACITY; i++) {
            Assert.assertEquals(false, rhymer.isFull());
            rhymer.countIn(testValue);
        }
        Assert.assertEquals(true, rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_INDICATOR, rhymer.peekaboo());
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.peekaboo());
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        testCountOutHelper(rhymer);
    }

    void testCountOutHelper(DefaultCountingOutRhymer rhymer) {
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_INDICATOR, rhymer.countOut());
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_INDICATOR, rhymer.countOut());    	
    }
}
