package top.lothar.interview;

public class MergeSinglyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList a = new SinglyList(1);
		SinglyList b = new SinglyList(2);
		SinglyList c = new SinglyList(3);
		SinglyList d = new SinglyList(4);
		SinglyList e = new SinglyList(5);
		//指针指向
		a.next=c;
		c.next=e;
		b.next=d;
		
		SinglyList list = Merge(a, b);
		
		printList(list);
		
	}
	/**
	 * 链表打印
	 * @param singlyList
	 */
	public static void printList(SinglyList singlyList) {
		if (singlyList==null||singlyList.next==null) {
			return ;
		}
		while(singlyList!=null) {
			//打印结点数据
			System.out.println(singlyList.getData());
			//切换下一个结点
			singlyList = singlyList.next;
		}
	}
	
	/**
	 * 递归解决
	 * @param listOne
	 * @param listTwo
	 * @return
	 */
	public static SinglyList Merge(SinglyList listOne , SinglyList listTwo) {
		if (listOne==null && listTwo==null) {
			return null;
		}
		if (listOne==null) {
			return listTwo;
		}
		if (listTwo==null) {
			return listOne;
		}
		//合并之后的链表
		SinglyList list = null;
		if (listOne.getData()>listTwo.getData()) {
			list = listTwo;
			list.next = Merge(listOne, listTwo.next);
		}else {
			list = listOne;
			list.next = Merge(listOne.next, listTwo);
		}
		return list;
	}
	
}
