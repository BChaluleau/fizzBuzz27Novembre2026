package ilu2;

public class FizzBuzzer {

	private static final int[] MAGIC_NUMBERS = { 3, 5 };

	private static final String[] MAGIC_KEYS = { "Fizz", "Buzz" };

	private int turn = 0;

	public String play() {
		turn++;

		for (int i = 0; i < MAGIC_NUMBERS.length; i++) {
			if (turn == MAGIC_NUMBERS[i]) {
				return MAGIC_KEYS[i];
			}
		}

		return Integer.toString(turn);
	}

}
