package top.lothar.LeetCode;

/**
 * ������
 * 
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ��������
 * 
 * @author ��·ͨ
 *
 */
public class NumberOfReplies {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 12321;
		boolean result = JudgeNumberOfReplies(data);
		if (result) {
			System.out.println(data+" is Number of replies!");
		}else {
			System.out.println(data+" is Not Number if replies!");
		}
	}
	/**
	 *  ����תΪ�ַ��� ��Ȼ���ַ����ָ�Ϊ���飬ֻ��Ҫѭ�������һ�볤�Ƚ����ж϶�ӦԪ���Ƿ���ȼ��ɡ�
	 * @param data
	 * @return
	 */
	public static Boolean JudgeNumberOfReplies(int data) {
		boolean flag = false; 
		//��int����ת��Ϊ�ַ���
		String dataStr = String.valueOf(data);
		//���ַ���ת��Ϊ����
		String[] datas = dataStr.split("");
		for(int i = 0 ; i < datas.length/2; i++) {
			if (datas[i].equals(datas[datas.length-1-i])) {
				flag = true;
				if (i==datas.length/2) {
					break;
				}
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	

}
