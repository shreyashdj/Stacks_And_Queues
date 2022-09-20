package com.bridgelabz.stacksAndQueues;

/*
 * @author SHREYASH JADHAV
 */
public class QueueOperations {
	
	// variables
	Node front;
	Node rear;
	
	/**
	 *	 method to print Linked List
	 */
	
	public void display() {
		
		Node temp = front;

	    if(temp == null) {
	    	System.out.println("\n Linked List is empty");
	    } else {
	    	System.out.print("\n Linked List : ");
	    	while (temp != null) {
	    		System.out.print(temp.data + " -> ");
	    		temp = temp.next;
	    	}
	    	System.out.print("null");
		}
		System.out.println();
	}

	/**
	 * 	method to add elements in Queue
	 */
	public void enqueue(int data) {
		
		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		if (isEmpty()) {
			
			front = newNode;
			rear = newNode;
			
		} else {
			
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	
	/*
	 *	method to check Linked List is empty or not
	 */
	
	public boolean isEmpty() {
		
		if (rear == null && front == null) {
			
			return true;
		}
		
		return false;
	}
	
}