AssocArray
==========

A custom Associative Array in Java utilizing a custom interface.

Features
========

- Allows for an array to be associative
- Dynamic in Size
- Null as a value is allowed
- Ability to export as a HashMap<String, E>

Implementation
==============

Basic use involves declaring an instance of the AssocArray<E> implementation of the AssocArrayInterface<E>:
	
	//make a new variable reference to the interface and create a new AssocArray implementation
	public AssocArrayInterface<String> list = new AssocArray<String>();

	//add items to the array through the syntax: var.add("key", value) where "key" is a string and value is of the type <E>
	list.add("first", "Al");
	list.add("last", "Petersen");
	list.add("middle", "N");

	//grab an iterator...
	Iterator<String> i = list.iterator();

	//and iterate through the heaps of fun! (using standard indexing notation)
	while (i.hasNext()) {
		System.out.println(i.next());
	}

	//or have even more fun by utilizing the Associative Power!
	System.out.println(list.get("last") + ", " + list.get("first") + " " + list.get("middle"));

	//can export as HashMap
	HashMap<String, String> map = list.export();


Overall methods available to the AssocArray can be viewed by in the AssocArrayInterface.java file; Included:

	void add(String key, E item) 		//add an item with type E, accessed by String key

	E first()							//return the first element value in the list
	E last()							//return the last element value in the list
	E get(String key)					//return the element value with the given key
	E get(int index)					//return the element value from the giving index position

	boolean remove(String key)			//true if removal of element with the given key succeeds; resizes array 
	boolean remove(int index)			//true if removal of element with given index succeeds; resizes array

	E getRemove(String key)				//remove the element with the given key and return the value; resizes array
	E getRemove(int index)				//remove the element with the given index and return the value; resizes array

	boolean isEmpty()					//returns true if there are no elements contained in the array
	int length()						//returns the number of elements in the AssocArray

	HashMap<String, E> export()			//returns a HashMap of the AssocArray

	Iterator<E> iterator()				//returns an iterator for the AssocArray

Use
===

Because I made this to see if I could (and because I thought it would be cool) feel free to go wild.



