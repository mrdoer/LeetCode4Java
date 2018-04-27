package chen.practice;

public class PrintASCII {
	public class Node{
		public Object data;
		public int num;
		Node next;
		public Node() {
			this(null,0,null);
		}
		public Node(Object data, int num, Node node) {
			this.data = data;
			this.num = num;
			this.next = node;
		}
	}
}
