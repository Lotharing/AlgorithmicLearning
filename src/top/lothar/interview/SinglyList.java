package top.lothar.interview;
/**
 * 单链表结构
 * @author 赵路通
 *
 */
public class SinglyList {
	
	private int data;
	
	public SinglyList next;
	
	public SinglyList(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.next=null;
	}
	
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
}
