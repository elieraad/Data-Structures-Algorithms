/*Elie Raad*/
/*elie-raad.blogspot.com*/
/*Data Structures & Algorithms: Linked Lists*/
package edu.lau.raad.elie.doublylinkedlist;

public class DoublyLinkedList<E> {

	// Private Node Class to be used only by the Singly Linked List Class
	private static class Node<E> {

		private E element;// Generic element to be stored
		private Node<E> next;// Reference to the next node in the list
		private Node<E> prev;// Reference to the previous node in the list

		public Node(E elt, Node<E> p, Node<E> n) {
			element = elt;
			next = n;
			prev = p;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public E getElement() {
			return element;
		}

	}

	private Node<E> header; // Header Sentinel
	private Node<E> trailer;// Footer Sentinel
	private int size = 0; // Count the element stored in this list

	public DoublyLinkedList() {
		header = new Node<E>(null, null, null);
		trailer = new Node<E>(null, header, null);
		header.setNext(trailer);
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
		return header.getElement();
	}

	// if not empty return last element, null otherwise
	public E last() {
		if (isEmpty())
			return null;
		return trailer.getElement();
	}

	// Add a new node at the start of the list
	public void addFirst(E elt) {
		addBetween(elt, header, header.getNext());
	}

	// Add a new node at the end of the list
	public void addLast(E elt) {
		addBetween(elt, trailer.getPrev(), trailer);
	}

	// Remove the first element in the list if not empty and return its element,
	// null otherwise
	public E removeFirst() {
		return remove(header.getNext());
	}

	// Remove the last element in the list if not empty and return its element, null
	// otherwise
	public E removeLast() {
		return remove(trailer.getPrev());
	}

	// Add element between two nodes
	private void addBetween(E elt, Node<E> prev, Node<E> next) {
		Node<E> newest = new Node<E>(elt, prev, next); // Create new node between two nodes
		prev.setNext(newest); // set next of the precedent node to newest
		next.setPrev(newest);// set previous of the successor node to newest
		size++; // increment size
	}

	// Remove node in the list if not empty and return its element, null
	// otherwise
	private E remove(Node<E> node) {
		if (isEmpty())// if empty return null
			return null;
		Node<E> prev = node.getPrev(); // otherwise save precedent node
		Node<E> next = node.getNext();// and save the successor node
		prev.setNext(next); // set the next of the precedent node to the successor node
		next.setPrev(prev); // set the previous of the successor node to the precedant node
		size--; // decrement size
		return node.getElement();
	}

}
