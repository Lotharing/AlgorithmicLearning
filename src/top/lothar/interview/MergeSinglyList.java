package top.lothar.interview;

public class MergeSinglyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList a = new SinglyList(1);
		SinglyList b = new SinglyList(2);
		SinglyList c = new SinglyList(3);
		SinglyList d = new SinglyList(4);
		SinglyList e = new SinglyList(5);
		//ָ��ָ��
		a.next=c;
		c.next=e;
		b.next=d;
		
		SinglyList list = Merge(a, b);
		
		printList(list);
		
	}
	/**
	 * �����ӡ
	 * @param singlyList
	 */
	public static void printList(SinglyList singlyList) {
		if (singlyList==null||singlyList.next==null) {
			return ;
		}
		while(singlyList!=null) {
			//��ӡ�������
			System.out.println(singlyList.getData());
			//�л���һ�����
			singlyList = singlyList.next;
		}
	}
	
	/**
	 * �ݹ���
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
		//�ϲ�֮�������
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
