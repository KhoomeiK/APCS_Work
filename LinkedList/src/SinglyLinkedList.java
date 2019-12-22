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
	private ListNode last;

	/**
	 * Constructor for the SinglyLinkedList object Generates an empty list.
	 */
	public SinglyLinkedList() {
		first = null;
		last = null;
	}

	/**
	 * Returns the first element in this list.
	 *
	 * @return the first element in the linked list.
	 */
	public int getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		else
			return first.getValue();
	}

	public int getLast() {
		if (last == null)
			throw new NoSuchElementException();
		else
			return last.getValue();
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

	public void addLast(int value) {
		// note the order that things happen:
		// head is parameter, then assigned

		if (first == null) {
			first = new ListNode(value, null);
			last = first;
		} else {
			last.setNext(new ListNode(value, null));
			last = last.getNext();
		}
	}

	/**
	 * Returns the size of the linked list from front to end
	 */
	public int size() {
		ListNode currentNode = first;
		int count = 0;

		while (currentNode != null) {
			count++;
			if (currentNode.getNext() != null)
				currentNode = currentNode.getNext();
			else
				return count;
		}
		return -1;
	}

	/**
	 * Prints the full list in the console
	 */
	public void printList() {
		ListNode currentNode = first;
		System.out.print("[");
		while (currentNode != null) {
			System.out.print(currentNode.getValue());
			if (currentNode.getNext() != null) {
				System.out.print(", ");
				currentNode = currentNode.getNext();
			} else
				System.out.println("]");
		}
	}

	public void insertInOrder(int num) {
		if (first == null) {
			addFirst(num);
		}

		// If the passed value is the lowest value
		if (first.getValue() > num) {
			addFirst(num);
		}
		// If the passed value is the highest value
		else if (last.getValue() < num) {
			addLast(num);
		}
		// If passed value is in between
		else {
			ListNode currentNode = first;
			while (currentNode.getNext() != null) {
				// If the node is bigger than the value, then insert here
				if (currentNode.getNext().getValue() > num) {
					ListNode temp = new ListNode(num, currentNode.getNext());
					currentNode.setNext(temp);
					return;
				}
				// If the node is smaller than the value, continue
				else {
					currentNode = currentNode.getNext();
				}
			}
		}
	}

	/*
	 * Removes the given value from the linked list
	 * 
	 * @param The object to test and remove
	 */
	public int remove(int obj) {
		if (first == null) {
			return -1;
		}

		ListNode currentNode = first;
		// Loop until the end
		while (currentNode.getNext() != null) {
			// If we have found it
			if (currentNode.getNext().getValue() == obj) {
				ListNode removingNode = currentNode.getNext();
				currentNode.setNext(removingNode.getNext());
				return (Integer) removingNode.getValue();
			}
			// Not found, continue looping
			else {
				currentNode = currentNode.getNext();
			}
		}
		// Got through all of it and didn't find it
		return -1;

	}

}
