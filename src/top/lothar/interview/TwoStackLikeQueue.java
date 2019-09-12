package top.lothar.interview;

import java.util.Stack;

/**
 * 两个栈模拟队列
 * @author 赵路通
 *
 */
public class TwoStackLikeQueue {
	
	private static Stack<Integer> stack1 = new Stack<Integer>();
	private static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		System.out.println("第一个:"+pop()+"\n第二个:"+pop()+"\n第三个:"+pop());
	}
	
	/**
	 * 元素放入栈1
	 * @param node
	 */
    public static void push(int node) {
        stack1.push(node);
    }
    /**
     * 栈1元素出栈，在放入栈2，栈2不为null则出栈元素
     * 总体实现先进先出
     * @return
     */
    public static int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

}
