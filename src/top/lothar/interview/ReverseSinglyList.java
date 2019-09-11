package top.lothar.interview;
/**
 * ����ת
 * @author ��·ͨ
 *
 */
public class ReverseSinglyList extends BaseLinkedListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList list = reverseSinglyList(createSinglyList());
		while(list!=null) {
			System.out.println(list.getData());
			list=list.next;
		}
	}
	
	public static SinglyList reverseSinglyList(SinglyList list) {
        SinglyList reverseHead = null;
        while (list != null) {
        	//��ָ�����洢list�ĺ��
        	SinglyList second = list.next; 
        	//System.out.println("����second"+second.getData());
        	//��list�ŵ�������ͷ�ڵ��ͷ��
            list.next = reverseHead; 
            //�ƶ��������ͷָ�룬����ʼ��ָ��������ͷ��
            reverseHead = list; 
            //��������ԭ����Ľڵ㣬��֮ǰָ���ŵĺ�̣�ѭ������
            list = second;   
        }
        return reverseHead;
	}
}