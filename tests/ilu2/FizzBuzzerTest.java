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
	void testJ3() {
		preshot(2);
		assertEquals("Fizz", fb.play());
	}

	private void preshot(int nbTurn) {
		for (int i = 0; i < nbTurn; i++) {
			fb.play();
		}
	}

	@Test
	void testJ4() {
		preshot(3);
		assertEquals("4", fb.play());
	}

}
