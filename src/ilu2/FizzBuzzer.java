package ilu2;

public class FizzBuzzer {

	private static final int MAGIC_NUMBER = 3;
	private static final String MAGIC_KEY = "Fizz";

	private int turn = 0;

	public String play() {
		turn++;
		if (turn == MAGIC_NUMBER) {
			return MAGIC_KEY;
		}
		return Integer.toString(turn);
	}

}
