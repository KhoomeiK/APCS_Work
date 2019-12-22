/* Rohan Pandey 6/28/17
 	Takes a number from 1-10 and 
 	finds its factorial.
 	Does not work.
 */
import java.util.Scanner;

public class test_C_1 {

	public static void main(String[] args) {
		Scanner intScan = new Scanner(System.in);
		System.out.println("Enter a number from 1-10:");
		int num = intScan.nextInt();
		
		int count = 1;
		while (count < 10){
			int fact = num * (num - count++);
			System.out.println(fact);
		} 
	}
}