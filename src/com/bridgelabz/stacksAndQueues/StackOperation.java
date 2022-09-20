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

	/*
	 * 	method to add data in Stack at top (head)
	 */
	
	public void push(int data) {

		Node newNode = new Node(data);		// created object of Node class & initialize with parameter data
		
		if (isEmpty()) {
			
			top = newNode;
			
		} else {
			
			newNode.next = top;
			top = newNode;
		}
		
	}

	/*
	 * 	method to return data at top of Stack
	 */
	
	public int peek() {
		
		if (isEmpty()) {
			
			System.out.println("\n Linked List is empty");
			return -1;
		}
		
		return top.data;
	}

	/*
	 * 	method to pop / delete data at top of Stack
	 */
	
	public void pop() {
		
		if (peek() == -1) {
			
			System.out.println("\n Linked List is empty");
			
		} else {
		
			int popped = peek();		// storing popped data
			top = top.next;
			System.out.println("\n Popped data : " + popped);
		}
		
		
	}

	/*
	 *	method to check Linked List is empty or not
	 */
	
	public boolean isEmpty() {
		
		if (top == null) {
			
			return true;
		}
		
		return false;
	}
	
}
