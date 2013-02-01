AssocArray
==========

A custom Associative Array in Java utilizing a custom interface.

Features
========

- Allows for an array to be associative
- Dynamic in Size

Use
===

Because I made this to see if I could (and because I thought it would be cool) feel free to go wild.

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
		System.out.println(list.get(i));
	}

	//or have even more fun by utilizing the Associative Power!
	System.out.println(list.get("last") + ", " + list.get("first") + " " + list.get("middle"));

TODO
====

Add Functionality to create AssocArrays by passing in collections or hashmaps.
