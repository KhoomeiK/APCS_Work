package Testing;

import java.util.Scanner;

/* Rohan Pandey
 * PalindromeTester.java
 * AP Computer Science - Period 7
 * Troxell
 * October 17, 2017
 * Purpose: Allow users to input and test palindromes
 * with the Palindrome.java class and its methods
 */

public class PalindromeTester {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String pali;
		
		do{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Input word (q to exit): ");
			pali = scan.nextLine(); // receives string input
			
			System.out.println(p.run(pali));
		} while(!pali.equals("q"));
	}

}
