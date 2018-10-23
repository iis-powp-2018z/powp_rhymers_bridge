package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
//kombinacja alt + ← oraz alt + → powodują otworzenie kolejnych projektów z grzewa projeku
//(jeśli nie zostały wcześniej otworzone) lub powoduje przekakiwanie między tymi oknami - o ile są otwarte