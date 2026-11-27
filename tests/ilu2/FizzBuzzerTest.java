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

	@Test
	void partieComplete() {
		String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz";
		assertEquals(expected, preshot(30));
	}

	private String preshot(int nbTurn) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nbTurn; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(fb.play());
		}
		return sb.toString();
	}
}
