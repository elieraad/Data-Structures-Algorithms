# Doubly Linked Lists
The second problem in our Singly Linked List was removing from the tail of the list. In order to achieve this we need to access the node preceding the tail, by traversing the whole list. A more efficient way can be achieved by saving in each node a reference to “previous”  in addition to “element” and “next”, this way we can traverse the list in the opposite direction. Since we only need the node preceding the tail we will end up with a constant running time.

 Another idea to make our code more readable and easy to implement is to create two “dummy” variables called header and trailer that holds a null value. When the list is empty, the “next” of the header points to the trailer and the “previous” of the trailer points to the header.  Now whenever we need to add or remove an element at any position, we can treat it as adding or removing between two nodes. 
 
 Read more at www.elie-raad.blogspot.com.
