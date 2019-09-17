package top.lothar.tree;

public class BaseTreeExample {
	
	
	/**
	 * 						¶þ²æÊ÷
	 *  		1
	 *  	2		3
	 *    4   5   6   7
	 * @return
	 * 
	 */
	protected static TreeNode createBinaryTree() {
		TreeNode head=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode three=new TreeNode(3);
		TreeNode four=new TreeNode(4);
		TreeNode five=new TreeNode(5);
		TreeNode six=new TreeNode(6);
		TreeNode seven=new TreeNode(7);
		head.leftNode=second;
		head.rightNode=three;
		second.leftNode=four;
		second.rightNode=five;
		three.leftNode=six;
		three.rightNode=seven;
		return head;
	}
	
}
