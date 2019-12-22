package Testing;
import java.util.Random;

public class ArrayFun {
	Rectangle[] makeRects() { // creates rectangle array
		Rectangle r0 = new Rectangle(1, 2); // various widths
		Rectangle r1 = new Rectangle(3, 4); // and lengths
		Rectangle r2 = new Rectangle(5, 6); // in each rectangle
		Rectangle r3 = new Rectangle(7, 8);
		Rectangle r4 = new Rectangle(1, 2);
		Rectangle rectList[] = { r0, r1, r2, r3, r4 }; // 5 element array
		return rectList;
	}

	Rectangle[] lenWid(Rectangle[] rectList) { // accepts array as parameter
		System.out.println("Length of 3rd rectangle is " + rectList[2].getLength());

		rectList[4].setWidth(5); // changes width of last rectangle to 5
		System.out.println("Width of last rectangle is " + rectList[4].getWidth());
		
		return rectList; // returns changed array
	}

	void exceptions(Rectangle[] rectList) {
		try {
			System.out.println(rectList[5].getLength()); // tries to access past end of array
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You have an ArrayIndexOutOfBoundsException");
		}

		try {
			Rectangle list[] = new Rectangle[2]; // creates rectangle array
			// rectangles point to null
			int a = list[0].getLength() + list[1].getLength(); // so throws exception
		} catch (NullPointerException e) {
			System.out.println("You have a NullPointerException" + '\n');
		}
	}

	int[] makeList() {
		int intList[] = new int[10]; // creates empty int array

		Random rand = new Random();
		for (int i = 0; i <= 7; i++) { // iterates through first 8 elements
			intList[i] = rand.nextInt(26) - 10; // randomly enters values  [-10 - 15]
			System.out.println(i + " : " + intList[i]); // prints indexes and values
		}

		return intList;
	}

	int[] findSum(int[] intList) {
		int temp = 0; // will contain total sum
		for (int i : intList)
			temp += i; // adds value of i in intList to temp
		System.out.println(temp + " is the sum");
		
		return intList;
	}
	
    //
	void findLow(int[] intList) {
		int temp = 16; // highest value
		int index = 0;
		for (int i = 0; i < 10; i++) {
			if (intList[i] <= temp) { // if value of intList at i is lower than temp,
				index = i; // set index to current i and
				temp = intList[i]; // set new temp to value of intList at i
			}
		}
		System.out.println("value at " + index + " is the lowest");
	}

	public static void main(String[] args) {
		ArrayFun a = new ArrayFun();

		a.exceptions(a.lenWid(a.makeRects())); // each method passes rectList to next
		a.findLow(a.findSum(a.makeList())); // each method passes intList to next
	}
}
