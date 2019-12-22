import java.util.*;

/**
 * Implementation of lists, using singly linked elements.
 *
 * @author G. Peck
 * @created April 27, 2002
 *
 *          modified March 2017 to only use int data type
 */
public class SinglyLinkedList {
	private ListNode first; // first element

	/**
	 * Constructor for the SinglyLinkedList object Generates an empty list.
	 */
	public SinglyLinkedList() {
		first = null;
	}

	/**
	 * Returns the first element in this list.
	 *
	 * @return the first element in the linked list.
	 */
	public int getFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		} else
			return first.getValue();
	}

	/**
	 * Inserts the given element at the beginning of this list.
	 *
	 * @param value
	 *            the element to be inserted at the beginning of this list.
	 */
	public void addFirst(int value) {
		// note the order that things happen:
		// head is parameter, then assigned
		first = new ListNode(value, first);
	}
	
	public void remove() {
		first = first.getNext();
	}
}
