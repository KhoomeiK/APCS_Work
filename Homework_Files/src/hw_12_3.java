
/* Rohan Pandey 
Homework 12.3 */

import java.util.Scanner;

public class hw_12_3 {
	public static void main(String[] args) {
		int capacity;
		int gauge;
		int mpg;

		Scanner scan = new Scanner(System.in);

		System.out.print("Tank capacity: ");
		capacity = scan.nextInt();
		System.out.print("Gauge reading: ");
		gauge = scan.nextInt();
		System.out.print("Miles per gallon: ");
		mpg = scan.nextInt();

		int pDist = mpg * capacity;
		double aDist = gauge * 0.01 * capacity * mpg;

		if (pDist >= 200) {
			if (aDist >= 200) {
				System.out.println("Safe to proceed");
			} else {
				System.out.println("Get gas");
			}
		} else {
			System.out.println("You're screwed");
		}
	}
}