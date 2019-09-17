package top.lothar.tree;
/**
 * 二叉树-数据结构
 * @author 赵路通
 *
 */
public class TreeNode {
	//结点数据
	int data;
	//左子树
	TreeNode leftNode;
	//右子树
	TreeNode rightNode;
	/**
	  * 构造器结点-构造器
	 * @param data
	 */
	public TreeNode(int data) {
		this.data=data;
	}
	/**
	  * 树构造器
	 * @param left
	 * @param right
	 * @param data
	 */
	public TreeNode(TreeNode left,TreeNode right,int data) {
		this.leftNode=left;
		this.rightNode=right;
		this.data=data;
	}

}
