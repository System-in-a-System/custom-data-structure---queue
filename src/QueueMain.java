

/**
 * The Class QueueMain.
 *
 * Testing playground for LinkedQueue class implementing IntQueue interface
 */
public class QueueMain {


	/**
	 * The main method where the testing of LinkedQueue class functionality is to be carried out
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		/** Create an instance of LinkedQueue */
		LinkedQueue testQueue = new LinkedQueue();
		
		/** Initial check */
		System.out.println(testQueue.isEmpty());
		System.out.println(testQueue.size());
	
		System.out.println(testQueue.toString());
		
		
		/** Exception handling check */
		try {
			System.out.println(testQueue.first());
			System.out.println(testQueue.last());
			System.out.println(testQueue.dequeue());
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Something went wrong: " + ex.getMessage());
		}
		

		
		/** Add elements & output string representation */
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		testQueue.enqueue(5);
		
		System.out.println(testQueue.isEmpty());
		System.out.println(testQueue.size());
		System.out.println(testQueue.toString());
		
		System.out.println(testQueue.first());
		System.out.println(testQueue.last());
		
		
		/** Operate on the elements & output string representation */ 
		testQueue.dequeue();
		System.out.println(testQueue.size());
		System.out.println(testQueue.toString());
		
		
		/** Iterator testing */
		while(testQueue.iterator().hasNext()) {
			System.out.println(testQueue.dequeue());
		}
		
		System.out.println(testQueue.toString());
		
		
	}

}
