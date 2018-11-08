package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.Generate;

	public interface Rhymersfactory {
	
		public Generate GetStandardRhymer();
		
		public Generate GetFalseRhymer();
		
		public Generate GetFIFORhymer();
		
		public Generate GetHanoiRhymer();
		
	}
