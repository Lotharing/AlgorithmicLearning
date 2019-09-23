package top.lothar.interview;

import java.util.Stack;

/**
 * ��������
 * 
 * It's a dog!
 * 
 * dog! a It's
 * 
 * @author ��·ͨ
 *
 */
public class WordsBackword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "It's a dog!";
		System.out.println("����-->"+a.toString());
		
		String[] temp = reverse(a);
		StringBuffer filter = new StringBuffer();
		for (String str : temp) {
			filter.append(str+" ");
		}
		System.out.println("����-->"+filter.toString());
	}
	
	public static String[] reverse(String str) {
		Stack<String> stack = new Stack<String>();
		String[] result = new String[3];
		String[] tempArr = str.split(" ");
		for (String string : tempArr) {
			stack.push(string);
		}
		int n = 0;
		while(!stack.isEmpty()) {
			result[n]=stack.pop();
			n++;
		}
		return result;
	}

}
