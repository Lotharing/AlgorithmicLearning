package top.lothar.stack;

import java.util.Stack;
/**
 * 有效的括号
 * 
 * 1.左括号必须与相同类型的右括号闭合
 * 
 * 2.左括号必须以正确的顺序闭合
 * 
 * @author Lothar
 *
 */
public class EffectiveParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "()",b = "(){}[]",c="(]",d="([)]",e="{[]}";
		System.out.println(isValid(e));
	}

	public static boolean isValid(String s) {
		//使用栈，先进后出的特性来解决
		Stack<Character> stack = new Stack<>();
		//遍历字符串
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			//左括号入栈
			if (ch=='(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else {
				if (stack.isEmpty()) {
					return false;
				}
				//右括号条件，左括号出栈与之比对
				char topChar = stack.pop();
				//三种比对情况都不是，括号匹配条件
	             if(ch == ')' && topChar != '('){
	                 return false;
	             }else if(ch == ']' && topChar != '['){
	                 return false;
	             }else if(ch == '}' && topChar != '{'){
	                 return false;
	             }
			}
		}
		//栈为NULL,说明都对应全部出栈，为True
		return stack.isEmpty();
	}
	
}
