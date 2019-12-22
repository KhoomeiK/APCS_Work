import java.util.Scanner;

public class hw_17_4 {

	public static void main(String[] args) {
		System.out.println("Initial number of stars:");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		String star = new String("********************");
		while (count >= 1){
			System.out.println(star.substring(0, count));
			count--;
		}
	}
}