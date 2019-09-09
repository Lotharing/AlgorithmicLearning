package top.lothar.interview;

import java.util.Arrays;
import java.util.Stack;
/**
 * ���鷴ת
 * @author ��·ͨ
 *
 */
public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {5,4,3,2,1};
		
		System.out.println(Arrays.toString(reversal(data)));
		
		System.out.println(Arrays.toString(stackReversal(data)));
		
		//long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		
		//long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		
		//System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��
		
	}
	
	public static int[] reversal(int arr[]) {
		
		for(int i = 0 ; i < arr.length/2 ; i++) {
			
			int temp = arr[arr.length - i -1];
			
			arr[arr.length - i -1] = arr[i];
			
			arr[i] = temp;
			
		}
		return arr;
	}
	
	public static int[] stackReversal(int arr[]) {
		Stack<Integer> stack = new Stack<Integer>();
		//����ջ��
		for (int a : arr) {
			stack.push(a);
		}
		//���γ�ջ��ֱ��Ϊ�գ��Ƚ����
		while(!stack.empty()) {
			int i = 0;
			arr[i] = stack.pop();
			i+=1;
		}
		return arr;
	}
	
}
