

/**
 * The Interface IntQueue.
 *
 * Interface for a custom data structure IntQueue
 */
public interface IntQueue extends Iterable<Integer> {
	
	 /**
 	 * Method to retrieve the size counter of the current queue 
 	 *
 	 * @return the integer value that represents the size of the queue
 	 */
	 public int size();  
	 
	 
	 /**
 	 * Method to check if the queue is empty.
 	 *
 	 * @return true, if the queue is empty
 	 */
	 public boolean isEmpty();
	 
	 
	 /**
 	 * Method to add an element at the end of the queue
	 *
	 * @param element to be added to the queue
 	 */
	 public void enqueue(int element);  
	 
	 
	 /**
 	 * Method to return and remove the first element in the queue
	 *
	 * @return the integer value of the the first node in the queue (the head)
	 * @throws IndexOutOfBoundsException the index out of bounds exception
 	 */
	 public int dequeue() throws IndexOutOfBoundsException;                
	 
	 
	 /**
 	 * Method to return (without removing) the first element in the queue
	 *
	 * @return the integer value of the first element in the queue
	 * @throws IndexOutOfBoundsException the index out of bounds exception
 	 */ 
	 public int first() throws IndexOutOfBoundsException; 
	 
	 
	 /**
 	 * Method to return (without removing) the last element in the queue
	 *
	 * @return the integer value of the last element in the queue
	 * @throws IndexOutOfBoundsException the index out of bounds exception
 	 */
	 public int last() throws IndexOutOfBoundsException;  
	 
	 
	 /**
 	 * Method to provide a string representation for a Linked Queue
	 *
	 * @return the string representation of the Linked Queue
 	 */
	 public String toString();              
}
