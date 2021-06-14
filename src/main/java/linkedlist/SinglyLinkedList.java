package linkedlist;

public class SinglyLinkedList {

	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.head = new ListNode(10);
		
		ListNode second = new ListNode(12);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(6);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		ListNode current = list.head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
}
