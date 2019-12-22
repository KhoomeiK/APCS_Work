import java.util.Scanner;

public class hw_17_3 {

	public static void main(String[] args) {
		Scanner xScan = new Scanner(System.in);
		Scanner nScan = new Scanner(System.in);
		
		System.out.println("Enter X:");
		int x = xScan.nextInt();
		System.out.println("Enter N:");
		int n = nScan.nextInt();
		
		String newX = new String();
		int count = 1;
		while (count <= n){
			newX = newX.concat(x + " * ");
			count++;
		}
		newX = newX.concat("1");
		System.out.println(newX);
		int X = Integer.parseInt(newX, x);
		System.out.println(X);
	}
}