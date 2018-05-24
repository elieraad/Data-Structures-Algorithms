# Circularly Linked Lists
In order to make our Singly Linked List more efficient we need to solve two problems: shifting and removing from the end of the list. 
In this section we will develop a solution to shifting by creating a new data structure that have all the methods of the singly linked list 
in addition to rotate( ). This data structure is called Circularly Linked List, it is nearly the same as Singly Linked List but 
have the tail pointing to the head. Now we don't need to keep a reference to the the first element (head), since we can get it 
using head.getNext( ). Finally, rotate method only change the tail reference to next node.

Read more at www.elie-raad.blogspot.com.
