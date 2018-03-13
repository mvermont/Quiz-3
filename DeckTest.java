package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Card;
import pkgCore.Deck;

class DeckTest {

	@Test
	void test() throws Exception {
		Deck d = new Deck();
		Card c = d.draw();
		assertEquals(3, d.getRemaining(c.getRank()));
		assertEquals(12, d.getRemaining(c.getSuit()));
	}

}
