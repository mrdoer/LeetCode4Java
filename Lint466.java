package chen.practice;

public class Lint466 {
    public int countNodes(ListNode head) {
        int num = 0;
        while(head != null) {
        	num++;
        	head = head.next;
        	
        }
        return num;
        	
    }
}
