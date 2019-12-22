import java.util.Scanner;

class power {
	// attributes
	int bs;
	int exp;
	
	// method
	int expTimes() {
		int start = 1;
		int count = 0;
		while (count < exp){
			start *= bs;
			count++;
		}
		return start;
	}
	
	// constructor
	power(int base, int exponent){
		bs = base;
		exp = exponent;
	}
	
}

public class math_power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input base:");
		int bas = scan.nextInt();
		System.out.println("Input exponent:");
		int expo = scan.nextInt();
		
		power test = new power(bas, expo);
		System.out.println(test.expTimes());
	}

}
