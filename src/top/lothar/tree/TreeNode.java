package top.lothar.tree;
/**
 * ������-���ݽṹ
 * @author ��·ͨ
 *
 */
public class TreeNode {
	//�������
	int data;
	//������
	TreeNode leftNode;
	//������
	TreeNode rightNode;
	/**
	  * ���������-������
	 * @param data
	 */
	public TreeNode(int data) {
		this.data=data;
	}
	/**
	  * ��������
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
