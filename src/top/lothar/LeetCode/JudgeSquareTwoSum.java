package top.lothar.LeetCode;
/**
 * 题目描述：判断一个数是否为两个数的平方和
 * 
 * INPUT : 5
 * 
 * OUTPUT : True
 * 
 * Explanation: 1 * 1 + 2 * 2 = 5
 * 
 * 双指针思想
 * 
 * @author LT
 *
 */
public class JudgeSquareTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeSquareSum(8));
	}
	
	public static boolean judgeSquareSum(int data) {
		int i = 0 , j = (int) Math.sqrt(data);
		while(i <= j) {
			int powSum = i * i + j * j;
			if (powSum==data) {
				return true;
			}else if(powSum > data){
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
}
