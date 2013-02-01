package assocArray;

import java.util.Iterator;


public interface AssocArrayInterface<E> {
	
	//add methods
	boolean add(String key, E item);
	
	//retrieve methods
	E first()          throws IndexOutOfBoundsException;
	E last()           throws IndexOutOfBoundsException;
	E get(String key)  throws NullPointerException;
	E get(int index)   throws IndexOutOfBoundsException;
	
	//remove methods
	boolean remove(String key);
	boolean remove(int index);
	
	//helper methods
	boolean isEmpty();
	int lenght();
	
	//get Iterator
	Iterator<E> iterator();
}
