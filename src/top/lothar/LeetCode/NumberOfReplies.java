package top.lothar.LeetCode;

/**
 * 回文数
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 
 * @author 赵路通
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
	 *  整数转为字符串 ，然后将字符串分割为数组，只需要循环数组的一半长度进行判断对应元素是否相等即可。
	 * @param data
	 * @return
	 */
	public static Boolean JudgeNumberOfReplies(int data) {
		boolean flag = false; 
		//将int整数转化为字符串
		String dataStr = String.valueOf(data);
		//将字符串转化为数组
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
