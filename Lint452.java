package chen.practice;
/*
 * Remove all elements from a linked list of integers that have value val. 
 */
public class Lint452 {
	/**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(0);
		ListNode n5 = new ListNode(5);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		show(head);
		System.out.println();
		
		removeElements(head, 5);
		
		show(head);
		
		
		
	}
    public static ListNode removeElements(ListNode head, int val) {
        // 假设链表没有头节点
    	//ListNode newHead = head;
    	ListNode node = head.next;

     	while (node != null) {
     		if( head.next.val == val) {
     			head.next = head.next.next;
     		}
     		if (node.next != null && node.next.val == val) {
				node.next = node.next.next;
			}else {
				node = node.next;
			}	    		
     	}
     	return head;
    }
    public static void show(ListNode head) {
    	ListNode node = head;
    	while(node.next != null) {
    		System.out.print(node.next.val);
    		System.out.print("-->");
    		node = node.next;
    	}
    	if(node.next == null)
    		System.out.println("null");	
	}

}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) {
	     val = x;
	     next = null;
	 }
 }
