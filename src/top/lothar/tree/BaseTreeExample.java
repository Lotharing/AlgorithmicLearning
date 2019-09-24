package top.lothar.tree;

public class BaseTreeExample {
	
	
	/**
	 * 						二叉树（完全）
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
	
	/**
	 * 树：中序，先序，后序，遍历使用,普通二叉树
	 * 					6
	 * 				  /   \
	 * 				3	   9
	 * 			   / \     / 
	 * 			  1   5   7
	 * 			   \  /    \
	 *             2  4     8
	 * @return
	 */
	protected static TreeNode createTree() {
		TreeNode J = new TreeNode(null,null,8);
		TreeNode H = new TreeNode(null,null,4);
		TreeNode G = new TreeNode(null,null,2);
		TreeNode F = new TreeNode(null, J, 7);
		TreeNode E = new TreeNode(H, null, 5);
		TreeNode D = new TreeNode(null, G, 1);
		TreeNode C = new TreeNode(F, null, 9);
		TreeNode B = new TreeNode(D, E, 3);
		TreeNode A = new TreeNode(B, C, 6);
		return A;
	}
	/**
	 * 构建对称二叉树
	 * 	1
	 * 2 2
	 * 
	 * @return
	 */
	protected static TreeNode createSymmetryTree() {
		TreeNode G = new TreeNode(null,null,3);
		TreeNode F = new TreeNode(null,null,4);
		TreeNode E = new TreeNode(null,null,4);
		TreeNode D = new TreeNode(null,null,3);
		TreeNode C = new TreeNode(G,F,2);
		TreeNode B = new TreeNode(E,D,2);
		TreeNode A = new TreeNode(C,B,1);
		return A;
	}
	
}
