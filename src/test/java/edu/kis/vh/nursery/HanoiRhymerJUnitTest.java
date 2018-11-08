package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUnitTest {
	private final int testValue = 4;

	@Test
	public void testCountInAndGetTotalRejected() {
		DefaultCountingOutRhymerJUnitTest defaultRhymerTest = new DefaultCountingOutRhymerJUnitTest();
		HanoiRhymer hanoiRhymer = new HanoiRhymer();

		// No numbers have been inserted nor rejected so far thus TotalRejected == 0
        Assert.assertEquals(0, hanoiRhymer.getTotalRejected());

		// do I need this?
        defaultRhymerTest.testCountInHelper(hanoiRhymer);

        // attempting to add a value that is greater than the current total (that is 4, check defaultRhymerTest.testCountInHelper) -> rejecting it
        hanoiRhymer.countIn(testValue + 1);
        Assert.assertEquals(1, hanoiRhymer.getTotalRejected());

        // attempting to add a value that is not greater than the current total (that is 4, check defaultRhymerTest.testCountInHelper)
        // -> adding it to the array. 1 is the max index because there are two elements in the array
        hanoiRhymer.countIn(testValue);
        Assert.assertEquals(1, hanoiRhymer.getTotal());
	}
}
