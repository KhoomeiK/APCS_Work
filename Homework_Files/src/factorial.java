import java.util.Scanner;

class num {
	int x; // number to find factorial of

	int factorial() { // factorial finder method
		int y = x - 1;
		int n = x * y;
		x = y;
		return factorial();
	}

	num(int z) { // constructor
		x = z;
	}
}

public class factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find factorial:");
		int number = scan.nextInt();
		num numero = new num(number);

		System.out.println("The factorial is " + numero.factorial());
	}

}
