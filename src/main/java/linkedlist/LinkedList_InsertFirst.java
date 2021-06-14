package linkedlist;


class Node1 {
	int data;
	Node1 next;
}

public class LinkedList_InsertFirst {
	
	Node1 head;
	public void addFirst(int val) {
		Node1 newNode = new Node1();
		newNode.data = val;
		newNode.next = head;
		
		head = newNode;
	}
	
	public void printValue() {
		Node1 tempNode = head;
		
		while(tempNode != null) {
			System.out.print(tempNode.data + "-->");
			tempNode = tempNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		LinkedList_InsertFirst list = new LinkedList_InsertFirst();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);

		list.printValue();
	}
}


