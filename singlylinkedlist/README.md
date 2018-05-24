# Singly Linked Lists

Singly Linked Lists are a chain of nodes, each storing an element and the reference to the next node. Linked Lists are dynamic, so nodes are created whenever we need to. Therefore, we don't have to worry about the capacity of the list like in Arrays.

Advantages of Singly linked lists:
<ul>
<li>Dynamic, no need to know the size.</li>
<li>Constant time to insert at head, insert at tail or remove from head!</li>
</ul>
Drawbacks:

<ul>

<li>Removing from the tail of the list would take O(n), n being the size of the whole list! Even if we saved a reference to the tail we still need the node directly before it.</li>
<li>Each node need two objects “element” and “next”.</li>
<li>Inefficient to shift since we need to remove from the first element create a new node and add it to the tail of the list.</li>
</ul>
Read more at <a href="elie-raad.blogspot.com">my blog</a>.
