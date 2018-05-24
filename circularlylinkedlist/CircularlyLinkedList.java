/*Elie Raad*/
/*elie-raad.blogspot.com*/
/*Data Structures & Algorithms: Linked Lists*/
package edu.lau.raad.elie.circularlylinkedlist;

public class CircularlyLinkedList<E> {

	// Private Node Class to be used only by the Singly Linked List Class
	private static class Node<E> {

		private E element;// Generic element to be stored
		private Node<E> next;// Reference to the next node in the list

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

	private Node<E> tail;// Last element in the list
	private int size = 0;// Count the element stored in this list

	public CircularlyLinkedList() {
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
		return tail.getNext().getElement();
	}

	// if not empty return last element, null otherwise
	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// Add a new node at the start of the list
	public void addFirst(E elt) {
		if (isEmpty()) { // if list is empty
			tail = new Node<E>(elt, null); // create a new tail holding the element
			tail.setNext(tail); // make its next point to itself (circular list)
		} else { // otherwise
			Node<E> newest = new Node<E>(elt, tail.getNext()); // create a new node elt pointing to the node next to
																// tail
			tail.setNext(newest); // let tail points to the newly created node
		}
		size++; // increment size
	}

	// Add a new node at the end of the list
	public void addLast(E elt) {
		addFirst(elt); // add element at the start of the list
		tail = tail.getNext(); // update the tail to reference the new node.
	}

	// Remove the first node in the list if not empty and return its element, null
	// otherwise
	public E removeFirst() {
		if (isEmpty()) // if empty return null
			return null;
		Node<E> head = tail.getNext(); // Save a reference for the head
		if (head == tail) // if the list initially have 1 element then head = tail = null;
			tail = null;
		else
			tail.setNext(head.getNext());// otherwise tail points to the node next the head
		size--; // decrement size
		return head.getElement();
	}

	// Rotate elements in the list
	public void rotate() {
		if (!isEmpty())
			tail = tail.getNext(); // if not empty move tail 1 element to the front
	}
}
