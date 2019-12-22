package FlexArray;

/* Rohan Pandey
 * FlexArrayPrimitive.java
 * AP Computer Science - Period 7
 * Troxell
 * November 14, 2017
 * Purpose: a class with many built in functinos
 * that can be used to manipulate an int array.
 */

public class FlexArrayPrimitive {
	public int myArray[];
	private int mySize;

	// default constructor
	FlexArrayPrimitive() {
		myArray = new int[20]; // creates with 20 elements
		mySize = 0;
	}

	// constructor taking length argument
	FlexArrayPrimitive(int len) {
		myArray = new int[len]; // creates elements of len amount
		mySize = 0;
	}

	// accessor returning array length
	public int getLength() {
		return mySize;
	}

	// accessor returning whether array has active elements
	public boolean isEmpty() {
		return mySize == 0;
	}

	// appends a number to end of array
	public void append(int data) {
		if (myArray[myArray.length - 1] != 0) // if array is full
			resize(); // resize it

		int i;
		for (i = 0; myArray[i] != 0; i++) // iterates up to first empty value
			i = i;
		myArray[i] = data; // enters data into array
		mySize++;
	}

	// inserts an int at a specified index
	public void insert(int index, int data) {
		int temp;
		if (myArray[myArray.length - 1] != 0) // if last element is filled
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
	public int discard(int index) {
		if (index >= mySize) // returns -999 if out of bounds
			return -999;

		int temp = myArray[index]; // saves value to be discarded
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
			if (myArray[i] != 0) // only prints active elements
				s += myArray[i] + ", "; // concatenates each element of array

		s = s.substring(0, s.length() - 2) + "]"; // removes last comma & space
		return s;
	}

	// "extends" myArray by 10 elements
	private void resize() {
		int newArray[] = new int[mySize + 10]; // 10 elements longer
		for (int i = 0; i <= mySize; i++)
			newArray[i] = myArray[i]; // copies myArray elements into newArray
		myArray = newArray; // myArray points to the new longer array
	}
	// -----------V2.0 Methods------------

	// returns difference between sum of elements in 2 FlexArrayPrimitives
	public int compareTo(FlexArrayPrimitive flexy) {
		int thisSum = 0; // variables for each sum
		int flexySum = 0;

		for (int i = 0; i < this.mySize; i++) // iterates through and calculates
			thisSum += this.myArray[i]; // sum for each array
		for (int i = 0; i < flexy.mySize; i++)
			flexySum += flexy.myArray[i];

		return thisSum - flexySum; // if myArray has a higher sum, the result is
									// positive
	}

	// returns whether number of active elements of 2 FlexArrayPrimitives are
	// the same
	public boolean equals(FlexArrayPrimitive flexy) {
		return this.mySize == flexy.mySize;
	}

	// sorts the active elements in myArray from low to high
	public void sort() { // uses bubble sort
		int temp = 0;
		for (int j = 0; j < mySize - 1; j++) { // outer loop
			for (int i = 0; i < mySize - j - 1; i++) { // inner loop
				if (myArray[i] > myArray[i + 1]) { // checks whether higher
					temp = myArray[i + 1]; // switch algorithm
					myArray[i + 1] = myArray[i];
					myArray[i] = temp;
				}
			}
		}
	}

	// returns value at an index in myArray
	public int getValue(int loc) {
		if (loc >= 0 && loc <= mySize) // checks whether in bounds of active
										// elements
			return myArray[loc];
		else
			return -999; // returns -999 if out of bounds
	}

	// searches for an element in an array and returns it
	public int searchFor(int target) {
		for (int i = 0; i <= mySize; i++) // iterates through array
			if (myArray[i] == target) // checking whether each element
				return i; // is the desired one
		return -1; // if not found, returns -1
	}

}
