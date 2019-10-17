package top.lothar.LeetCode;

import java.util.Arrays;

/**
 * 题目描述：在有序数组中找出两个数，使它们的和为 target。
 * 
 * @author LT
 * 
 * 双指针思想
 *
 */
public class TwoSumAddTarget {
	
	public static void main(String[] args) {
		int [] data = {2,7,11,16,17};
		int target = 18;
		int[] result = twoSum(data, target);
		System.out.println("[位置,位置，值，值]-->"+Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] numbers , int target) {
		int i = 0 , j  = numbers.length-1;
		while(i < j) {
			//首尾相加
			int sum = numbers[i]+numbers[j];
			if (sum==target) {
				//直接输出当前数组中符合条件的位置和值
				return new int[] {i + 1,j + 1,numbers[i],numbers[j]};
			}else if(sum < target) {
				//有序序列两端极值，相加还小，则移动i"指针下一位"
				i++;
			}else {
				//有序序列两端极值，相加较大，则移动j"指针前一位"
				j--;
			}
		}
		return null;
	}
}
