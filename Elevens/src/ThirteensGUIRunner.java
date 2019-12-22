/* Rohan Pandey
 * ThirteensGUIRunner.java
 * AP Computer Science - Period 7
 * Troxell
 * January 29, 2018
 * Purpose: a class that can be used to graphically play the
 * Thirteens game which is primarily coded in ThirteensBoard.java
 */

public class ThirteensGUIRunner {
	public static void main(String[] args) {
		Board thirteens = new ThirteensBoard();
		CardGameGUI GUI = new CardGameGUI(thirteens);
		GUI.displayGame();
	}
}