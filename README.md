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

	public AssocArrayInterface<E> gargantua = new AssocArray<E>(); 			//basic use of the class: Keys are type String, Values are type <E>
	
Examples:

	public AssocArrayInterface<String> list = new AssocArray<String>();		//create a new reference and assign the AssocArray implementation

	list.add("first", "Al");												//add values to array
	list.add("last", "Petersen");											//syntax: var.add("key", value);
	list.add("middle", "N");

	Iterator<String> i = list.iterator();									//grab an iterator...

	while (i.hasNext()) {													//...and iterate through the heaps of fun!
		System.out.println(i.next());
	}

	String o = list.get("last") + list.get("first") + list.get("middle")	//or have even more fun by utilizing the power of Association!

	HashMap<String, String> map = list.export();							//export as a crazy HashMap


Overall methods available to the AssocArray can be viewed by in the AssocArrayInterface.java file; Included:

	boolean add(String key, E item) 			//add an item with type E, accessed by String key
	boolean add(String key, E item, int pos)	//add an item with type E, accessed by String key, at position pos

	E first()									//return the first element value in the list
	E last()									//return the last element value in the list
	E get(String key)							//return the element value with the given key
	E get(int index)							//return the element value from the giving index position

	boolean remove(String key)					//true if removal of element with the given key succeeds; resizes array 
	boolean remove(int index)					//true if removal of element with given index succeeds; resizes array

	E getRemove(String key)						//remove the element with the given key and return the value; resizes array
	E getRemove(int index)						//remove the element with the given index and return the value; resizes array

	boolean isEmpty()							//returns true if there are no elements contained in the array
	int length()								//returns the number of elements in the AssocArray

	HashMap<String, E> export()					//returns a HashMap of the AssocArray

	Iterator<E> iterator()						//returns an iterator for the AssocArray

Use
===

Because I made this to see if I could (and because I thought it would be cool) feel free to go wild.

Updates
=======

* new add method to add an item at a certain position; resizes array
* updated error checking and exceptions thrown

TODO
====

* make a merge utility method
