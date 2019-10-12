package top.lothar.LeetCode;

import top.lothar.interview.BaseLinkedListExample;
import top.lothar.interview.SinglyList;
/**
 * �ж������Ƿ���ڻ�
 * 
 * ˫ָ��
 * 
 * @author ��·ͨ
 *
 */
public class AnnularLinkedList extends BaseLinkedListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasCycle(createCycleList()));
	}
	/**
	 * ˫ָ����������ȷ�����ڻ�
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
