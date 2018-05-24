/*Elie Raad*/
/*elie-raad.blogspot.com*/
/*Data Structures & Algorithms: Linked Lists*/

package edu.lau.raad.elie.singlylinkedlist;

public class SinglyLinkedList<E> {

	// Private Node Class to be used only by the Singly Linked List Class
	private static class Node<E> {

		private E element; // Generic element to be stored
		private Node<E> next; // Reference to the next node in the list

		public Node(E elt, Node<E> nxt) {
			element = elt;
			next = nxt;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> nxt) {
			next = nxt;
		}

		public E getElement() {
			return element;
		}

	}

	private Node<E> head; // First element in the list
	private Node<E> tail; // Last element in the list
	private int size = 0; // Count the element stored in this list

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	// Return size
	public int size() {
		return size;
	}

	// true if size = 0, false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	// if not empty return first element, null otherwise
	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	// if not empty return last element, null otherwise
	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// Add a new node at the start of the list
	public void addFirst(E elt) {
		Node<E> newest = new Node<E>(elt, head); // Create a node holding elt and pointing to head
		head = newest; // Update the head to be the new first node
		if (isEmpty()) // if the list is originally empty head = tail = newest
			tail = newest;
		size++; // increment size
	}

	// Add a new node at the end of the list
	public void addLast(E elt) {
		Node<E> newest = new Node<E>(elt, null);// Create a node holding elt and pointing to null (end)
		if (isEmpty()) // if the list is originally empty head = tail = newest
			head = newest;
		else
			tail.setNext(newest);// update the pointer of the node preceding the new last, otherwise
		tail = newest;// Update the tail to be the new last node
		size++; // increment size
	}

	// Remove the first node in the list if not empty and return its element, null
	// otherwise
	public E removeFirst() {
		if (isEmpty()) // if empty return null
			return null;
		E toReturn = head.getElement(); // Save the element to return
		if (head == tail) // if the list has only 1 tail should be set to null
			tail = null;
		head = head.getNext(); // update head to become the second element, null if only 1 element present
		size--; // decrement size

		return toReturn;
	}

}
