package FlexArray;

/**
 * @(#)Rectangle.java
 *
 * 					purpose: used in driver to show difference of memory
 *                    allocation of Strings vs. "real" objects (Rectangles)
 *
 * @author Debra Troxell
 * 
 * @version 1.00 2009/11/13
 */

public class Rectangle {
	int myLength;
	int myWidth;

	// default constructor
	public Rectangle() {
		myWidth = 0;
		myLength = 0;
	}

	// constructor that takes values for both parameters
	public Rectangle(int w, int l) {
		myWidth = w;
		myLength = l;
	}

	// accessors
	public int getWidth() {
		return myWidth;
	}

	public int getLength() {
		return myLength;
	}

	// modifiers
	public void setWidth(int w) {
		myWidth = w;
	}

	public void setLength(int len) {
		myLength = len;
	}

	public int getArea() {
		return myWidth * myLength;
	}

	// returns a String representation of the Rectangle object
	public String toString() {
		return ("Rectangle, width = " + myWidth + " length = " + myLength);
	}

	// returns true if both instance variables are exactly the same
	public boolean equals(Rectangle r) {
		return (myLength == r.myLength && myWidth == r.myWidth);
	}

	// returns a negative number if the area of this object is less than the
	// object passed as an argument
	// returns 0 if the areas are equal
	// returns a positive number if the area of this object is greater than the
	// object passed as an argument
	public int compareTo(Rectangle r) {
		return myLength * myWidth - r.myLength * r.myWidth;
	}
}