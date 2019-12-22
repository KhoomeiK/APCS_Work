package Craps;

/*
 * Rohan Pandey
 * Period 7 APCS
 * October 2, 2017
 * 
 * Purpose: defines the Die class which is used as
 * a die in the Craps game
 */


import java.util.Random;

public class Die {
	private int num;

	public void roll() {
		Random rand = new Random();
		int r = rand.nextInt(6) + 1;
		num = r;
	}

	public int getNumDots() {
		return num;
	}
}
