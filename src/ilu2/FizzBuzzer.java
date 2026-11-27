package ilu2;

public class FizzBuzzer {
	// dictionnaire
	/*
	 * private static final int[] MAGIC_KEYS = { 15, 3, 5 }; private static final
	 * String[] MAGIC_VALUES = { "FizzBuzz", "Fizz", "Buzz" };
	 */

	private static final int[] MAGIC_KEYS = { 3, 5 };
	private static final String[] MAGIC_VALUES = { "Fizz", "Buzz" };

	private int turn = 0;

	public String play() {
		turn++;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (turn % MAGIC_KEYS[i] == 0) {
				sb.append(MAGIC_VALUES[i]);
			}
		}

		return sb.isEmpty() ? Integer.toString(turn) : sb.toString();
	}

}
