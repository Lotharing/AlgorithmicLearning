package top.lothar.interview;

import java.util.Stack;

/**
 * ����ջģ�����
 * @author ��·ͨ
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
		System.out.println("��һ��:"+pop()+"\n�ڶ���:"+pop()+"\n������:"+pop());
	}
	
	/**
	 * Ԫ�ط���ջ1
	 * @param node
	 */
    public static void push(int node) {
        stack1.push(node);
    }
    /**
     * ջ1Ԫ�س�ջ���ڷ���ջ2��ջ2��Ϊnull���ջԪ��
     * ����ʵ���Ƚ��ȳ�
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
