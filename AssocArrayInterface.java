package AssocArray;

import java.util.*;


public interface AssocArrayInterface<E> {
	
	//add methods
	boolean add(String key, E item);
	boolean add(String key, E item, int position);
	
	//retrieve methods
	E first();
	E last();
	E get(String key)  throws NullPointerException;
	E get(int index)   throws IndexOutOfBoundsException;
	
	//remove methods
	boolean remove(String key) throws NullPointerException;
	boolean remove(int index)  throws IndexOutOfBoundsException;
	E getRemove(String key)    throws NullPointerException;
	E getRemove(int index)     throws IndexOutOfBoundsException;
	
	//helper methods
	boolean isEmpty();
	int length();
	HashMap<String, E> export();
	
	//get Iterator
	Iterator<E> iterator();

}
