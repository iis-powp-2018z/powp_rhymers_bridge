package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    DefaultCountingOutRhymer getStandardRhymer();

    DefaultCountingOutRhymer getFalseRhymer();

    DefaultCountingOutRhymer getFIFORhymer();

//  kombinacja alt + -> i alt + <- pozwala przejsc do poprzednio otwartego miejscaw  kodzie
    DefaultCountingOutRhymer getHanoiRhymer();

}
