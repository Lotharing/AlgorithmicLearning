package top.lothar.stack;

import java.util.Stack;
/**
 * ��Ч������
 * 
 * 1.�����ű�������ͬ���͵������űպ�
 * 
 * 2.�����ű�������ȷ��˳��պ�
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
		//ʹ��ջ���Ƚ���������������
		Stack<Character> stack = new Stack<>();
		//�����ַ���
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			//��������ջ
			if (ch=='(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else {
				if (stack.isEmpty()) {
					return false;
				}
				//�����������������ų�ջ��֮�ȶ�
				char topChar = stack.pop();
				//���ֱȶ���������ǣ�����ƥ������
	             if(ch == ')' && topChar != '('){
	                 return false;
	             }else if(ch == ']' && topChar != '['){
	                 return false;
	             }else if(ch == '}' && topChar != '{'){
	                 return false;
	             }
			}
		}
		//ջΪNULL,˵������Ӧȫ����ջ��ΪTrue
		return stack.isEmpty();
	}
	
}
