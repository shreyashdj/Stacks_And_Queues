package com.bridgelabz.stacksAndQueues;

/*
 * @author SHREYASH JADHAV
 */
public class Main {

	public static void main(String[] args) {
		
		/*
		 * 	Stack Methods
		 */
		
		System.out.println("\n **** Stack Methods ****");
		
		StackOperation stackOperation = new StackOperation();	// created object of StackOperation class
		
		System.out.println("\n **** Pushing Operation ****");
		System.out.println("\n **** Pushing 70 then 30 then 56 ****");

		/*
		 * 	pushing 70, 30, 56 using push method
		 */
		
		stackOperation.push(70);
		stackOperation.push(30);
		stackOperation.push(56);
		
		stackOperation.display();		//	printing Linked List using display method
		
		System.out.println("\n **** Popping Operation ****");
		
		/*
		 * 	used pop and display method in while loop to
		 *  pop data and print Linked List till it gets empty
		 */
		
		while ( !stackOperation.isEmpty() ) {
			stackOperation.pop();
			stackOperation.display();
		}

	}

}
