package Craps;

/*
 * Rohan Pandey
 * Period 7 APCS
 * October 2, 2017
 * 
 * Purpose: implements logic for the Craps game
 */

public class CrapsGame {
	private int point = 0;

	/**
	 * Calculates the result of the next dice roll in the Craps game. The
	 * parameter total is the sum of dots on two dice. point is set to the saved
	 * total, if the game continues, or 0, if the game has ended. Returns 1 if
	 * player won, -1 if player lost, 0 if player continues rolling.
	 */
	public int processRoll(int total) {
		int result = 0;
		if (point == 0) {
			if (total == 7 || total == 11) { // win at 7, 11
				point = 0;
				result = 1;
			} else if (total == 2 || total == 3 || total == 12) { // lose at 2,
																	// 3, 12
				point = 0;
				result = -1;
			} else {
				point = total;
				result = 0;
			}
		} else if (point != 0) { // when point has been set to previous total
			if (total == point) { // if point = current total, win
				point = 0;
				result = 1;
			} else if (total == 7) { // if point = 7, lose
				point = 0;
				result = -1;
			} else { // else, try again
				result = 0;
			}
		}
		return result;
	}

	public int getPoint() { // returns saved point
		return point;
	}
}
