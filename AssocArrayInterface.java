package AssocArray;

import java.util.Iterator;


public interface AssocArrayInterface<E> {
	
	//add methods
	boolean add(String key, E item);
	
	//retrieve methods
	E first()          throws IndexOutOfBoundsException;
	E last()           throws IndexOutOfBoundsException;
	E get(String key)  throws IndexOutOfBoundsException;
	E get(int index)   throws IndexOutOfBoundsException;
	
	//remove methods
	boolean remove(String key) throws IndexOutOfBoundsException;
	boolean remove(int index)  throws IndexOutOfBoundsException;
	E getRemove(String key)    throws IndexOutOfBoundsException;
	E getRemove(int index)     throws IndexOutOfBoundsException;
	
	//helper methods
	boolean isEmpty();
	int lenght();
	
	//get Iterator
	Iterator<E> iterator();
}
