package top.lothar.interview;

public class BaseLinkedListExample {
	
	/**
	 * 构建单链表 1->2->3->4-5
	 * @return
	 */
	protected static SinglyList createSinglyList() {
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
		return a;
	}
	
}
