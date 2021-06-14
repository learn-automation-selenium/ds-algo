package stack;

import java.util.EmptyStackException;

public class Stack {

	private ListNode top;
	private int length;
	
	public Stack() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int data = top.data;
		top = top.next;
		length--;
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		

	}

}

class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}
