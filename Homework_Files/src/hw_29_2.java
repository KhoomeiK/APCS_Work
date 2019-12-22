import java.util.Scanner;

public class hw_29_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		
		int num = 0;
		while (num < str.length()){
			System.out.print(str.charAt(num) + " ");
			num++;
		}
		
		System.out.println("");
		num = 1;
		while (num < str.length()){
			System.out.println(str.charAt(num));
			num++;
		}
	}
}