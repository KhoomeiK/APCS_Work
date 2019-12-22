package FlexArray;

/* Rohan Pandey
 * FlexArrayRectangle.java
 * AP Computer Science - Period 7
 * Troxell
 * November 14, 2017
 * Purpose: a class with many built in functinos
 * that can be used to manipulate a Rectangle array.
 */

public class FlexArrayRectangle {
	private int mySize;
	private Rectangle myArray[];

	// default constructor
	FlexArrayRectangle() {
		myArray = new Rectangle[20]; // creates with 20 elements
	}

	// constructor taking length argument
	FlexArrayRectangle(int len) {
		myArray = new Rectangle[len]; // creates elements of len amount
	}

	// accessor returning array length
	public int getLength() {
		return mySize;
	}

	// accessor returning whether array has active elements
	public boolean isEmpty() {
		return mySize == 0;
	}

	// appends a Rectangle to end of array
	public void append(Rectangle data) {
		if (myArray[myArray.length - 1] != null) // if array is full
			resize(); // resize it

		int i;
		for (i = 0; myArray[i] != null; i++) // iterates up to first empty value
			i = i;
		myArray[i] = data; // enters data into array
		mySize++;
	}

	// inserts an int at a specified index
	public void insert(int index, Rectangle data) {
		Rectangle temp;
		if (myArray[myArray.length - 1] != null) // if last element is filled
			resize(); // resize array

		// everything shifted forward to create 1 space
		for (int i = myArray.length - 2; i > index; i--) {
			temp = myArray[i];
			myArray[i] = myArray[i - 1];
			myArray[i + 1] = temp;
		}
		myArray[index] = data; // data inserted at index
		mySize++;
	}

	// removes a certain value at given index
	public Rectangle discard(int index) {
		if (index >= myArray.length) // returns -999 if out of bounds
			return null;

		Rectangle temp = myArray[index]; // saves value to be discarded
		for (int i = index; i < myArray.length - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		mySize--;
		return temp; // returns discarded value
	}

	// returns String representation of array
	public String toString() {
		String s = "[";

		for (int i = 0; i < myArray.length; i++)
			if (myArray[i] != null) // only active elements printed
				s += myArray[i].toString() + ", area = " + myArray[i].getArea() + "\n"; // concatenates
																						// each
																						// element
																						// of
																						// array

		s = s.substring(0, s.length() - 1) + "]";
		return s;
	}

	// "extends" myArray by 10 elements
	private void resize() {
		Rectangle newArray[] = new Rectangle[mySize + 10];
		for (int i = 0; i < mySize; i++)
			newArray[i] = myArray[i]; // copies myArray elements into newArray

		myArray = newArray; // myArray points to the new longer array
	}
	// -----------V2.0 Methods------------

	// returns difference between sum of element lengths in 2
	// FlexArrayRectangles
	public int compareTo(FlexArrayRectangle flexy) {
		int thisSum = 0; // variables for each sum
		int flexySum = 0;

		for (int i = 0; i < this.mySize; i++) // iterates through and calculates
			thisSum += this.myArray[i].getLength(); // sum for each array
		for (int i = 0; i < flexy.mySize; i++)
			flexySum += flexy.myArray[i].getLength();

		return thisSum - flexySum; // if myArray has a higher sum, the result is
									// positive
	}

	// returns whether number of active elements of 2 FlexArrayRectangles are
	// the same
	public boolean equals(FlexArrayRectangle flexy) {
		return this.mySize == flexy.mySize;
	}

	// sorts the active elements in myArray from low to high based on compareTo
	public void sort() { // uses bubble sort
		Rectangle temp;
		for (int j = 0; j < mySize - 1; j++) { // outer loop
			for (int i = 0; i < mySize - j - 1; i++) { // inner loop
				if (myArray[i].compareTo(myArray[i + 1]) > 0) {
					// checks whether higher based on Rectangle's compareTo
					temp = myArray[i + 1]; // switch algorithm
					myArray[i + 1] = myArray[i];
					myArray[i] = temp;
				}
			}
		}
	}

	// returns value at an index in myArray
	public Rectangle getValue(int loc) {
		if (loc >= 0 && loc <= mySize) // checks whether in bounds of active
										// elements
			return myArray[loc];
		else
			return null; // returns -999 if out of bounds
	}

	// searches for an element in an array and returns it
	public int searchFor(Rectangle target) {
		for (int i = 0; i < mySize - 1; i++) // iterates through array
			if (myArray[i].equals(target)) // checking whether each element
				return i; // is the desired one
		return -1;
	}
}
