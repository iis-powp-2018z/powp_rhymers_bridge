package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;

public class DefaultRhymersFactoryJUnitTest {
	private final DefaultRhymersFactory factory = new DefaultRhymersFactory();

    @Test
    public void testGetStandardRhymer() {
    	DefaultCountingOutRhymer factoryRhymer = factory.getStandardRhymer();
    	DefaultCountingOutRhymer standardRhymer = new DefaultCountingOutRhymer();

    	Assert.assertEquals(true, factoryRhymer.getClass().equals(standardRhymer.getClass()));
    }

    @Test
    public void testGetFalseRhymer() {
    	DefaultCountingOutRhymer factoryRhymer = factory.getFalseRhymer();
    	DefaultCountingOutRhymer falseRhymer = new DefaultCountingOutRhymer();

    	Assert.assertEquals(true, factoryRhymer.getClass().equals(falseRhymer.getClass()));
    }

    @Test
    public void testGetFIFORhymer() {
    	DefaultCountingOutRhymer factoryRhymer = factory.getFIFORhymer();
        FIFORhymer fifoRhymer = new FIFORhymer();

        Assert.assertEquals(true, factoryRhymer.getClass().equals(fifoRhymer.getClass()));
    }

    @Test
    public void testGetHanoiRhymer() {
    	DefaultCountingOutRhymer factoryRhymer = factory.getHanoiRhymer();
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        Assert.assertEquals(true, factoryRhymer.getClass().equals(hanoiRhymer.getClass()));
    }
}
