/* Rohan Pandey 
Classwork 15.2 */

import java.util.Scanner;

public class hw_15_2 {
	public static void main(String[] args) {
		String word;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		word = scan.nextLine();
		
		int times = word.length();
		//System.out.println(times);
		
		int count = 0;
		while (count < times) {
			System.out.println(word);
			count++ ;
		}
	}
}