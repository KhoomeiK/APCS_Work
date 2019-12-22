package Testing;

/* Rohan Pandey
 * Palindrome.java
 * AP Computer Science - Period 7
 * Troxell
 * October 17, 2017
 * Purpose: Test whether a string, excluding symbols but
 * including numbers, is a palindrome.
 */

public class Palindrome {
	String reverse(String str, int len, boolean bool) {
		String fin = ""; // final reversed string
		String chr;
		if (bool) // if string length even
			for (int i = len; i > 0; i--) { // starts at last character and
											// moves left
				chr = str.substring(i - 1, i); // takes 1 character
				fin = fin.concat(chr); // adds the character to final string
			}
		else
			for (int i = len + 1; i > 0; i--) { // starts at last character and
												// moves left
				chr = str.substring(i - 1, i); // takes 1 character
				fin = fin.concat(chr); // adds the character to final string
			}
		return fin;
	}

	String replace(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!((c >= '0' && c <= '9') || // ASCII locations of symbols
					(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
				str = str.replace(c, ' ');
			}
		}
		str = str.replace(" ", "");
		return str;
	}

	String run(String input) {
		Palindrome p = new Palindrome(); // palindrome object for implementation
											// of other methods

		String text = input.toLowerCase();
		text = p.replace(text); // deletes symbols

		int len = text.length();
		boolean b = (len % 2 == 0); // evaluates if string length is even
		String text1, text2; // text1 is first half, text2 is second half

		if (b) { // if even
			len /= 2;
			text1 = text.substring(0, len);
			text2 = text.substring(len);
		} else { // if odd
			len /= 2;
			text1 = text.substring(0, len + 1); // includes middle character
			text2 = text.substring(len);
		}

		text2 = p.reverse(text2, len, b); // reverses character order of
											// text2

		if (input.equals("q"))
			return ("You have quit");
		else if (text1.equals(text2) && (input.length() != 1)) // checks whether
																// text1 and
																// text2 are
																// same
			return ("Yes, " + input + " is a palindrome");
		else
			return ("No, " + input + " is not a palindrome");
	}
}
