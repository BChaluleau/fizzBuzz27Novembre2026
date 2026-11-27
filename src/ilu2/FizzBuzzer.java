package ilu2;

public class FizzBuzzer {
	// dictionnaire
	private static final int[] MAGIC_KEYS = { 3, 5 };
	private static final String[] MAGIC_VALUES = { "Fizz", "Buzz" };

	private int turn = 0;

	public String play() {
		turn++;

		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (turn % MAGIC_KEYS[i] == 0) {
				return MAGIC_VALUES[i];
			}
		}

		return Integer.toString(turn);
	}

}
