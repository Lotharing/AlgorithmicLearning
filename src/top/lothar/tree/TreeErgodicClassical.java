package top.lothar.tree;

import java.util.Stack;


public class TreeErgodicClassical extends BaseTreeExample{
	
	public static void main(String[] args) {
		System.out.print("先序-->");
		firstErgodic(createTree());
		System.out.print("\n"+"中序-->");
		midErgodic(createTree());
		System.out.print("\n"+"后序-->");
		lastErgodic(createTree());
	}
	/**
	 * 打印结点值
	 * @param node
	 */
	public static void printNodeData(TreeNode node) {
		System.out.print(node.data+" ");
	}
	
	/**
	 * 先序遍历
	 * 根-左-右
	 * 
	 * 递归实现
	 * @param root
	 */
	public static void firstErgodic(TreeNode root) {
		printNodeData(root);
		if(root.leftNode!=null) {
			firstErgodic(root.leftNode);
		}
		if (root.rightNode!=null) {
			firstErgodic(root.rightNode);
		}
	}
	/**
	 * 中序遍历
	 * 左-根-右
	 * @param root
	 */
	public static void midErgodic(TreeNode root) {
		 Stack<TreeNode> stack = new Stack<TreeNode>();  
	        TreeNode node = root;  
	        while (node != null || stack.size() > 0) {  
	            if (node != null) {
	            	//直接压栈  
	                stack.push(node);
	                node = node.leftNode;  
	            } else { 
	            	//出栈并访问  
	                node = stack.pop();
	                printNodeData(node);
	                node = node.rightNode; 
	            }  
	        }  
	}
	/**
	 * 后序遍历
	 * 左-右-根
	 * @param root
	 */
	public static void lastErgodic(TreeNode root) {
	        Stack<TreeNode> stack = new Stack<TreeNode>();  
	        //构造一个中间栈来存储逆后序遍历的结果  
	        Stack<TreeNode> output = new Stack<TreeNode>();
	        TreeNode node = root;  
	        while (node != null || stack.size() > 0) {  
	            if (node != null) {  
	                output.push(node);  
	                stack.push(node);                 
	                node = node.rightNode;  
	            } else {  
	                node = stack.pop();               
	                node = node.leftNode;
	            }  
	        }  
	        //System.out.println(output.size());
	        while (output.size() > 0) {
	            printNodeData(output.pop());
	        }  
	}
}
