package top.lothar.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DFS 深度优先遍历
 * BFS 广度优先遍历
 * @author 赵路通
 *
 *			1
 *		2		3
 *	  4   5   6    7
 */
public class TreeErgodic extends BaseTreeExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = createBinaryTree();
		System.out.print("广度优先遍历结果：");
		BroadFirstSearch(head);
		System.out.println("\n");
		System.out.print("深度优先遍历结果：");
		depthFirstSearch(head);
	}
	
	/**
	 * BFS
	 * 广度优先遍历-队列实现
	 * 从左到右 
	 * @param nodeHead
	 */
	public static void BroadFirstSearch(TreeNode nodeHead) {
		if(nodeHead==null) {
			return;
		}
		Queue<TreeNode> myQueue=new LinkedList<>();
		myQueue.add(nodeHead);
		while(!myQueue.isEmpty()) {
			//先进先出，把检索父节点并移除
			TreeNode node=myQueue.poll();
			//输出从队列移出结点的值
			System.out.print(node.data+" ");
			//判断左子树结点
			if(null!=node.leftNode) {
				//将当前结点左子树放入队列
				myQueue.add(node.leftNode);
			}
			//判断右子树结点
			if(null!=node.rightNode) {
				//将当前结点右子树放入队列
				myQueue.add(node.rightNode);
			}
		}
	}
	/**
	 * DFS
	 * 深度优先遍历-栈实现
	 * 从浅入深
	 * @param nodeHead
	 */
	public static void depthFirstSearch(TreeNode nodeHead) {
		if(nodeHead==null) {
			return;
		}
		Stack<TreeNode> myStack=new Stack<>();
		//根结点入栈
		myStack.push(nodeHead);
		while(!myStack.isEmpty()) {
			//先进后出，先检索父结点并出栈
			TreeNode node=myStack.pop();
			//输出从栈中移除的队列值
			System.out.print(node.data+" ");
			/**
			 * 先入栈右子树-在入栈左子树
			 * 出栈左子树
			 * 入栈左子树中的右子结点，入栈左子树中的左子节点
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
