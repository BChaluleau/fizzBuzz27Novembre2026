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
	void test() {
		assertEquals("1", fb.play());
	}

}
