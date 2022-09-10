package com.bridgelabz.stacksAndQueues;

/*
 * @author SHREYASH JADHAV
 */
public class StackOperation {
	
		Node top;	// variable

	/*
	 *	 method to print Linked List
	 */
	
	public void display() {
		
		Node temp = top;

	    if(temp == null) {
	    	System.out.println("\n Stack is empty");
	    } else {
	    	System.out.print("\n Stack List : ");
	    	while (temp != null) {
	    		System.out.print(temp.data + " -> ");
	    		temp = temp.next;
	    	}
	    	System.out.print("null");
		}
		
	}

	/*
	 * 	method to add data in Stack
	 */
	
	public void push(int data) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		if (top == null) {
			
			top = newNode;
			
		} else {
			
			newNode.next = top;
			top = newNode;
		}
		
	}

}
