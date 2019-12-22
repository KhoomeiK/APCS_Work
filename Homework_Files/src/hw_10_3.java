/* Rohan Pandey 
Homework 10.3 */

import java.util.Scanner;

public class hw_10_3 {

	public static void main(String[] args) {
		int change;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the change in cents: ");
		change = scan.nextInt();
		
		int dls = change / 100;
		int qts = (change % 100) / 25;
		int dms = (change % 25) / 10;
		int nks = (change % 10) / 5;
		int cts = (change % 5);
		
		System.out.println(dls + " dollars " +
		qts + " quarters " + dms + " dimes " + 
		nks + " nickels " + cts + " cents ");
	}

}
