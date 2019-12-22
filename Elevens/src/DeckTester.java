/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {

		Deck dk = new Deck(new String[] { "ace", "two", "three", "four" }, new String[] { "club", "heart" },
				new int[] { 1, 2, 3, 4 });

		System.out.println(dk.toString());
		System.out.println("just dealt: " + dk.deal());
		System.out.println("size: " + dk.size());
		System.out.println(dk.toString());
		dk.shuffle();
		System.out.println("new size: " + dk.size());
		System.out.println("after shuffling: " + dk.toString());

		Deck empty = new Deck(new String[] {}, new String[] {}, new int[] {});
		System.out.println(empty.size());
		System.out.println(empty.toString());
		empty.shuffle();
		//System.out.println("deal from empty " + empty.deal());
		/*
		 * Deck dk52 = new Deck( new String[] { "ace", "two", "three", "four", "five",
		 * "six", "seven", "eight", "nine", "ten", "jack", "queen", "king" }, new
		 * String[] { "clubs", "hearts", "diamonds", "spades" }, new int[] { 1, 2, 3, 4,
		 * 5, 6, 7, 8, 9, 10, 11, 12, 13 }); System.out.println(dk52.toString());
		 * System.out.println(dk52.deal()); System.out.println(dk52.deal());
		 * System.out.println(dk52.isEmpty()); System.out.println(dk52.size() + " \n");
		 * System.out.println("after deal " + dk52.toString()); dk52.shuffle();
		 * System.out.println("after shuffle " + dk52.toString());
		 * System.out.println(dk52.size());
		 */
	}
}
