package top.lothar.interview;

import java.util.Arrays;
import java.util.Stack;
/**
 * 数组反转
 * @author 赵路通
 *
 */
public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {5,4,3,2,1};
		
		System.out.println(Arrays.toString(reversal(data)));
		
		System.out.println(Arrays.toString(stackReversal(data)));
		
		//long startTime = System.currentTimeMillis();    //获取开始时间
		
		//long endTime = System.currentTimeMillis();    //获取结束时间
		
		//System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		
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
		//存入栈中
		for (int a : arr) {
			stack.push(a);
		}
		//依次出栈，直至为空，先进后出
		while(!stack.empty()) {
			int i = 0;
			arr[i] = stack.pop();
			i+=1;
		}
		return arr;
	}
	
}
