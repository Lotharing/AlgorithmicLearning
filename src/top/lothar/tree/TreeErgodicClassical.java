package top.lothar.tree;

import java.util.Stack;


public class TreeErgodicClassical extends BaseTreeExample{
	
	public static void main(String[] args) {
		System.out.print("����-->");
		firstErgodic(createTree());
		System.out.print("\n"+"����-->");
		midErgodic(createTree());
		System.out.print("\n"+"����-->");
		lastErgodic(createTree());
	}
	/**
	 * ��ӡ���ֵ
	 * @param node
	 */
	public static void printNodeData(TreeNode node) {
		System.out.print(node.data+" ");
	}
	
	/**
	 * �������
	 * ��-��-��
	 * 
	 * �ݹ�ʵ��
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
	 * �������
	 * ��-��-��
	 * @param root
	 */
	public static void midErgodic(TreeNode root) {
		 Stack<TreeNode> stack = new Stack<TreeNode>();  
	        TreeNode node = root;  
	        while (node != null || stack.size() > 0) {  
	            if (node != null) {
	            	//ֱ��ѹջ  
	                stack.push(node);
	                node = node.leftNode;  
	            } else { 
	            	//��ջ������  
	                node = stack.pop();
	                printNodeData(node);
	                node = node.rightNode; 
	            }  
	        }  
	}
	/**
	 * �������
	 * ��-��-��
	 * @param root
	 */
	public static void lastErgodic(TreeNode root) {
	        Stack<TreeNode> stack = new Stack<TreeNode>();  
	        //����һ���м�ջ���洢���������Ľ��  
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
