package chen.practice;
/*
 * Find the maximum node in a binary tree, return the node.
 */

public class Lint632 {
	public static TreeNode maxNode = new TreeNode(Integer.MIN_VALUE);
	public TreeNode maxNode(TreeNode root) {
		

		traverseTree(root);
		
		return maxNode;
	}
	
	public void traverseTree(TreeNode node) {
		
		if(node != null) {
			if(node.val>maxNode.val)
				maxNode = node;
			traverseTree(node.left);
			traverseTree(node.right);
		}

	}
	
}
	




	/*public class TreeNode {
	    public int val;
	    public TreeNode left, right;
	    public TreeNode(int val) {
	        this.val = val;
	        this.left = this.right = null;
	    }
	}*/
