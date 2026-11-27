package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer fb;

	@BeforeEach
	public void setup() {
		fb = new FizzBuzzer();

	}

	@Test
	void testPremierJoueur() {
		assertEquals("1", fb.play());
	}

	@Test
	void testSecondJoueur() {
		fb.play();
		assertEquals("2", fb.play());
	}

	@Test
	void testPremierFizz() {
		preshot(2);
		assertEquals("Fizz", fb.play());
	}

	@Test
	void testJ4() {
		preshot(3);
		assertEquals("4", fb.play());
	}

	@Test
	void testPremierBuzz() {
		preshot(4);
		assertEquals("Buzz", fb.play());

	}

	@Test
	void testSecondFizz() {
		preshot(5);
		assertEquals("Fizz", fb.play());

	}

	@Test
	void testDebutPartie() {
		preshot(6);
		assertEquals("7", fb.play());
		assertEquals("8", fb.play());
		assertEquals("Fizz", fb.play());
		assertEquals("Buzz", fb.play());
	}

	@Test
	void testPremierFizzbuzz() {
		preshot(14);
		assertEquals("FizzBuzz", fb.play());
	}

	private void preshot(int nbTurn) {
		for (int i = 0; i < nbTurn; i++) {
			fb.play();
		}
	}
}
