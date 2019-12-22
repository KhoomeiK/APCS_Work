/* Rohan Pandey 
Homework 10.2 */

import java.util.Scanner;

public class hw_10_2 {

	public static void main(String[] args) {
		int inputInt;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		inputInt = scan.nextInt();
		
		System.out.println((inputInt / 100) + " dollars and " +
				(inputInt % 100) + " cents");
	}
}