package top.lothar.LeetCode;

import top.lothar.interview.BaseLinkedListExample;
import top.lothar.interview.SinglyList;
/**
 * 判断链表是否存在环
 * 
 * 双指针
 * 
 * @author 赵路通
 *
 */
public class AnnularLinkedList extends BaseLinkedListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasCycle(createCycleList()));
	}
	/**
	 * 双指针相遇，则确定有内环
	 * @param head
	 * @return
	 */
	public static boolean hasCycle(SinglyList head) {
		if(head==null) {
			return false;
		}
		SinglyList l1 = head,l2 = head.next;
		while(l1!=null && l2!=null && l2.next!=null) {
			if (l1 == l2) {
				return true;
			}
			l1 = l1.next;
			l2 = l2.next.next;
		}
		return false;
	}
}
