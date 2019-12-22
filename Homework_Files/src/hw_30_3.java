import java.util.Scanner;

class helloObject {
	String y;
	helloObject z;

	String print() {
		return y;
	}
	
	String printObj() {
		return z.y;
	}

	helloObject(String x) {
		y = x;
	}

	helloObject(helloObject o) {
		z = o;
	}

}

public class hw_30_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter greeting:");
		String greeting = scan.nextLine();

		helloObject obj1 = new helloObject(greeting);
		helloObject obj2 = new helloObject(obj1);

		System.out.println(obj1.print());
		System.out.println(obj2.printObj());
	}

}
