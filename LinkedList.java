import java.util.*;

public class LinkedList {
	Node head; //the first node in the sequence
	int size;
	//Create an instance of a new node in the linkedlist
	public LinkedList() {
		head = null;
		size = 0; //keeps track of the length of linked list
	}
	
	
	public String get(int index) {
		Node n = head;
		for(int i = 0; i < index; i++) {
			n = n.next; //traverse through each node in the list
		}
		System.out.println("Get node: " + n.data);
		return n.data;
	}
	
	
	public void addAtHead(String data) {
		Node n = new Node();	//create a new node
		n.data = data;
		n.next = head;	//assign previous 1st node to new head node's reference pointer
		head = n;	//assign new node to be head			
		++size; 	//increase size
	}
	
	public void addAtIndex(int index, String data) {
		Node n = head;
		
		//if index value is greater than the list size:
		if(index > size) {
			System.out.println("Index greater than list size. Please try again.");
		}
		else if(index == 0)  { //if index value equal to 0:
			addAtHead(data);
		}
		else if(index == size) { //if index value is equal to size:
			addAtTail(data);
		}
		else { //add index at specified index value
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			Node p = new Node();
			p.data = data;
			p.next = n.next;	//Pointer to pointer of previous node
			n.next = p;		//Pointer of previous node points to next node
			++size;
		}
		
	}
	
	public void addAtTail(String data) {
		Node n = head;
		for(int i = 0; i < size-1; i++) {  //Continue looping until you reach the last node in sequence
			n = n.next;
		}
		
		if(n != null) {
			Node p = new Node(); //create a new node
			p.data = data; 
			p.next = null;  //point new node to null to signify end of linkedlist
			n.next = p;  //Previous last node pointer will point to new last node 
			
		}
		++size;
	}
	
	
	public void show() {
		Node n = head;
		
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	}
	
}
