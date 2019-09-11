package top.lothar.interview;
/**
 * 链表反转
 * @author 赵路通
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
        	//先指针来存储list的后继
        	SinglyList second = list.next; 
        	//System.out.println("链表second"+second.getData());
        	//将list放到新链表头节点的头部
            list.next = reverseHead; 
            //移动新链表的头指针，让它始终指向新链表头部
            reverseHead = list; 
            //继续处理原链表的节点，即之前指针存放的后继，循环往复
            list = second;   
        }
        return reverseHead;
	}
}