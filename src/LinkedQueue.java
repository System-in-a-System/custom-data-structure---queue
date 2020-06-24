
import java.util.Iterator;

/**
 * The Class LinkedQueue.
 *
 * Concrete class that implements IntQueue interface and defines LinkedQueue functionality
 */
public class LinkedQueue implements IntQueue {

	/** Private data fields: */
	
	/** The size counter. */
	private int size = 0;
	/** The head of the linked queue. */
	private Node head = null; 
	
	
	
	/** Implement methods from IntQueue interface: */

	/**
	 * Method to retrieve the size of the queue.
	 *
	 * @return the current queue size
	 */
	@Override
	public int size() {
		return size;
	}
	
	
	/**
	 * Method to check if the queue is empty.
	 *
	 * @return true, if the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	
	/**
	 * Method to add an element at the end of the queue
	 *
	 * @param element to be added to the queue
	 */ 
	@Override
	public void enqueue(int element) {
		
		/** Checking if the head is "vacant" */
		if (head == null) 
			head = new Node(element);
		
		/** If the head position is already taken, loop till the last attached node in the queue */
		else {
			Node node = head;
			while (node.next != null ) 
				node = node.next;
			
			/** Attach new node at the end of the queue */
			node.next = new Node(element); 
		}
		
		/** Update the size count */
		size ++;					
	}

	
	/**
	 * Method to return and remove the first element in the queue
	 *
	 * @return the integer value of the the first node in the queue (the head)
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	@Override
	public int dequeue() throws IndexOutOfBoundsException {
		
		if (!isEmpty()) {
			
			/** Retrieve the first element in the queue */
	        int oldHead = head.getValue();
			
			/** Reassign the next node to the head position */ 
	        head = head.next; 
	        
	        /** Update the size counter */
	        size --;
	  
	        return oldHead; 
			
		} else {
			throw new IndexOutOfBoundsException("The queue is empty");
		}
		
	}

	
	/**
	 * Method to return (without removing) the first element in the queue
	 *
	 * @return the integer value of the first element in the queue
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	@Override
	public int first() throws IndexOutOfBoundsException {
		/** Check if a queue is empty */
		if(!isEmpty()) 
			/** return the first element in the queue */
			return head.getValue();
		else
			throw new IndexOutOfBoundsException("The queue is empty");
	}

	
	/**
	 * Method to return (without removing) the last element in the queue
	 *
	 * @return the integer value of the last element in the queue
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */ 
	@Override
	public int last() throws IndexOutOfBoundsException {
		
		/** Check if the queue is empty */
		if(!isEmpty()) {
			/** Locate the head node */
			Node node = head;
			
			/** Loop till the end of the linked queue */
			while (node.next != null ) 
				node = node.next;
			
			/** Retrieve the value of the last node in the queue */
			int lastElement = node.getValue(); 
			
			return lastElement;
		
		} else {
			throw new IndexOutOfBoundsException("The queue is empty");
		}
			
	}
	
	
	/**
	 * Method to provide a string representation for a Linked Queue
	 *
	 * @return the string representation of the Linked Queue
	 */
	@Override
	public String toString() {
		
		/** Instantiate a new StringBuffer */
		StringBuffer buf = new StringBuffer();
		
		/** Add the opening brace */
		buf.append("[");
		
		/** If the queue is not empty its content will be retrieved */ 
		if (!isEmpty()) {
			Node node = head;
			buf.append(node.getValue());
		
			/** Looping till the end of the linked queue retrieving its content */
			while (node.next != null ) {
				node = node.next;
				buf.append(" " + node.getValue());
			}
		}
		
		/** Add the closing brace */
		buf.append(" ]");
		
		return buf.toString();
	}
	
	
	/**
	 * Method to perform iteration function on the LinkedQueue
	 *
	 * @return the ListIterator object
	 */
	@Override
	public Iterator<Integer> iterator() {
		return new ListIterator();
	}
	
	
	
	/**
	 * The Class ListIterator.
	 * Private inner class used by iterator()
	 */
	class ListIterator implements Iterator<Integer> { 
		
		/** The initial node. */
		private Node node = head;
		
		
		/**
		 * Method to retrieve the value from the subsequent node
		 *
		 * @return the integer value of the subsequent node
		 */
		public Integer next() {
			/** The value of the current node */
			int val = node.value; 
			/** Move on to the value of the next node */
			node = node.next; 
			
			return val;
		}
		
		/**
		 * Method to check if there is a subsequent node in a linked Queue.
		 *
		 * @return true, if there is a subsequent node
		 */
		public boolean hasNext() {
			return node != null;
		}
		
		/**
		 * Method remove() from Iterable interface is not implemented in this class
		 */
		public void remove() { 
			throw new RuntimeException("remove() is not implemented"); 
		}
	}
	
	
	
	/**
	 * Private inner Node class
	 */
	private class Node { 
		
		/** The integer value that each node instance holds. */
		int value;
		
		/** The reference to the next node which each node instance holds */
		Node next = null;
		
		
		/**
		 * Instantiates a new node.
		 *
		 * @param theValue is the integer value that the instantiated node will hold
		 */
		public Node(int theValue) { 
			value = theValue;
		}
		
		/**
		 * Method to retrieve the integer value from the node.
		 *
		 * @return the integer value that the current node holds
		 */
		public int getValue() {
			return value;
		}
	}
}
