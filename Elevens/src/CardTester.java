/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("two", "club", 2);
		Card b = new Card("two", "club", 2);
		Card c = new Card("eight", "heart", 8);
		
		System.out.println(a.toString());
		System.out.println(a.matches(b));
		System.out.println(a.matches(c));
	}
}
