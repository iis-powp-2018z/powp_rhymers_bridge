package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    //to jest wewnatrz klasy wiec musi byc wciete
    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    //OLD:
//	public void countIn(int in) {
//	if (!callCheck() && in > peekaboo())
//			totalRejected++;
//			else
//				super.countIn(in);
//	}

    //jeśli już tak bardzo odczuwamy potrzebę robienia bezklamrowych if-elsów to należy zadbać o stosowne wcięcia
    //które w czytelny sposób wskażą, jaka instrukcja wykona się przy jakim warunku
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    // AD 3.1.3 alt ze strzałkami skacze po ostatnich miejscach w których "byliśmy" wstecz (lewa strzałka)
    // i do przodu(prawa strzałka)
}
