package top.lothar.interview;
/**
 * ������ṹ
 * @author ��·ͨ
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
