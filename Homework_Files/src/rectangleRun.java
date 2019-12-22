import java.util.Scanner;

class rectangle {

	// attributes
	int length;
	int height;

	// methods
	int getArea() {
		int area = length * height;
		return area;
	}

	int getPeri() {
		int peri = length * 2 + height * 2;
		return peri;
	}

	double getCross() {
		double pre = (length * length) + (height * height);
		double cross = Math.sqrt(pre);
		return cross;
	}

	public String toString() {
		return "Length: " + length + "   " + "Height: " + height;
	}

	// constructors
	rectangle(int len, int hgt) {
		length = len;
		height = hgt;
	}

	rectangle(int len) {
		length = len;
		height = len;
	}
}

public class rectangleRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input r1 length: ");
		int r1Len = scan.nextInt();
		System.out.println("Input r1 height: ");
		int r1Hgt = scan.nextInt();
		System.out.println("Input r2 length: ");
		int r2Len = scan.nextInt();

		rectangle r1 = new rectangle(r1Len, r1Hgt);
		rectangle r2 = new rectangle(r2Len);

		System.out.println("r1 " + r1);
		System.out.println("r2 " + r2);

		System.out.println("r1 area: " + r1.getArea());
		System.out.println("r1 perimeter: " + r1.getPeri());
		System.out.println("r1 cross: " + r1.getCross());
		System.out.println("r2 area: " + r2.getArea());
		System.out.println("r2 perimeter: " + r2.getPeri());
		System.out.println("r2 cross: " + r2.getCross());
	}
}