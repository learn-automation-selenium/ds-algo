package linkedlist;

public class LinkedListBasics {

	public static void main(String[] args) {
		
		// declaration of three nodes
		Node head, second, third;
		
		// creation on three nodes
		head = new Node();
		second = new Node();
		third = new Node();
		
		// initialization of all nodes with data
		head.data = 10;
		second.data = 20;
		third.data = 30;
		
		// linking of all nodes with each other
		head.next = second;
		second.next = third;
		third.next = null;
		
		// printing of node values
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

}

class Node {
	int data;
	Node next;
}
