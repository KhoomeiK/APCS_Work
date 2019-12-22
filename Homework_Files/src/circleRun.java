class circle {
	// attributes
	int rad;

	// methods
	double getArea() {
		double area = Math.PI * rad * rad;
		return area;
	}

	double getCircmf() {
		double circmf = 2 * Math.PI * rad;
		return circmf;
	}

	// constructors
	circle(int radius) {
		rad = radius;
	}

	circle() {
		rad = 5;
	}
}

public class circleRun {

	public static void main(String[] args) {
		circle c1 = new circle(12);
		circle c2 = new circle();

		System.out.println("Circle 1 area: " + c1.getArea());
		System.out.println("Circle 1 circumference: " + c1.getCircmf());
		System.out.println("Circle 2 area: " + c2.getArea());
		System.out.println("Circle 2 circumference: " + c2.getCircmf());
	}
}