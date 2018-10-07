package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

//  kombinacja alt + -> i alt + <- pozwala przejsc do poprzednio otwartego miejscaw  kodzie
    public DefaultCountingOutRhymer getHanoiRhymer();

}
