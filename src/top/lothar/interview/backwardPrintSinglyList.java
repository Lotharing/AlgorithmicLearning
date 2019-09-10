package top.lothar.interview;

import java.util.Stack;

public class backwardPrintSinglyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList a = new SinglyList(1);
		SinglyList b = new SinglyList(2);
		SinglyList c = new SinglyList(3);
		SinglyList d = new SinglyList(4);
		SinglyList e = new SinglyList(5);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		
		useStackPrintSinglyList(a);
		
		printListRecursive(a);
	}
	/**
	 * 栈特性-单链表逆序打印
	 * @param list
	 */
	public static void useStackPrintSinglyList(SinglyList list) {
		Stack<Integer> stack = new Stack<Integer>();
		//入栈
		while(list!=null) {
			stack.push(list.getData());
			list = list.next;
		}
		//出栈
		while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
	}
	/**
	 * 递归思想-单链表逆序打印
	 * @param list
	 */
    public static void printListRecursive(SinglyList list){
        if(list!=null) {
            if(list.next!=null){
            	printListRecursive(list.next);
            }
        }
        System.out.println(list.getData());
    }
    
}
