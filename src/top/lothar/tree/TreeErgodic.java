package top.lothar.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DFS ������ȱ���
 * BFS ������ȱ���
 * @author ��·ͨ
 *
 *			1
 *		2		3
 *	  4   5   6    7
 */
public class TreeErgodic extends BaseTreeExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = createBinaryTree();
		System.out.print("������ȱ��������");
		BroadFirstSearch(head);
		System.out.println("\n");
		System.out.print("������ȱ��������");
		depthFirstSearch(head);
	}
	
	/**
	 * BFS
	 * ������ȱ���-����ʵ��
	 * ������ 
	 * @param nodeHead
	 */
	public static void BroadFirstSearch(TreeNode nodeHead) {
		if(nodeHead==null) {
			return;
		}
		Queue<TreeNode> myQueue=new LinkedList<>();
		myQueue.add(nodeHead);
		while(!myQueue.isEmpty()) {
			//�Ƚ��ȳ����Ѽ������ڵ㲢�Ƴ�
			TreeNode node=myQueue.poll();
			//����Ӷ����Ƴ�����ֵ
			System.out.print(node.data+" ");
			//�ж����������
			if(null!=node.leftNode) {
				//����ǰ����������������
				myQueue.add(node.leftNode);
			}
			//�ж����������
			if(null!=node.rightNode) {
				//����ǰ����������������
				myQueue.add(node.rightNode);
			}
		}
	}
	/**
	 * DFS
	 * ������ȱ���-ջʵ��
	 * ��ǳ����
	 * @param nodeHead
	 */
	public static void depthFirstSearch(TreeNode nodeHead) {
		if(nodeHead==null) {
			return;
		}
		Stack<TreeNode> myStack=new Stack<>();
		//�������ջ
		myStack.push(nodeHead);
		while(!myStack.isEmpty()) {
			//�Ƚ�������ȼ�������㲢��ջ
			TreeNode node=myStack.pop();
			//�����ջ���Ƴ��Ķ���ֵ
			System.out.print(node.data+" ");
			/**
			 * ����ջ������-����ջ������
			 * ��ջ������
			 * ��ջ�������е����ӽ�㣬��ջ�������е����ӽڵ�
			 */
			if(node.rightNode!=null) {
				myStack.push(node.rightNode);
			}
			if(node.leftNode!=null) {
				myStack.push(node.leftNode);
			}

		}
	}
	

}
