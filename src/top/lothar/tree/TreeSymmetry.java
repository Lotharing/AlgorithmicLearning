package top.lothar.tree;
/**
 * 二叉树对称
 * @author 赵路通
 *
 */
public class TreeSymmetry extends BaseTreeExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(treeSymmetry(createSymmetryTree()));
	}
	
	public static boolean treeSymmetry(TreeNode head) {
		return isMirror(head, head);
	}
	
	public static boolean isMirror(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    return (t1.data == t2.data)
	        && isMirror(t1.rightNode, t2.leftNode)
	        && isMirror(t1.leftNode, t2.rightNode);
	}


}
