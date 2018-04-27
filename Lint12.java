package chen.practice;
/*
 * Implement a stack with min() function, which will return the smallest number in the stack.
 * It should support push, pop and min operation all in O(1) cost.
 */
public class Lint12 {

	private static int min = Integer.MIN_VALUE;
	private static StackNode head = null; 
	private static StackNode tail = null; 
	
	public Lint12() {
		head.next = tail;
	}
	private static void push(int data) {
		StackNode node = new StackNode(data);
		
		
	}
	
	private static int pop() {
		return min;
		
	}
	
	private static int min() {
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
class StackNode{
	public StackNode prior;	
	public StackNode next;
	public int data;
	


	public StackNode(int data) {
		this.data = data;
	}

	public StackNode(StackNode prior, StackNode next, int data) {
		this.prior = prior;
		this.next = next;
		this.data = data;
	}

	
	
}
