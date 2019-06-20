package top.lothar.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author 赵路通
 * 
  * 题目内容：
 * 
 * 		给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 *
 * 		你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 *
 *		Input---> 	number = [2, 7, 11, 15], target = 9
 *
 *		OutPut-->	[0, 1]
 */
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		int[] nums = {2 ,7 , 11, 15};
		
		int target = 9;
		
		int[] result = twoSum(nums,target);
		
		int[] data = twoSum(nums, target, map);
		
		System.out.println(Arrays.toString(result));
		
		toResult(result);
		
		toResult(data);
		
	}
	/**
	 * 时间复杂度：O(n^2)   空间复杂度：O(1)
	 * 暴力解决方案,直接遍历所有两两情况，类似于乘法口诀输出算法
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums , int target) {
		
		for (int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1; j < nums.length; j++) {
				
				if (nums[i] + nums[j] == target) {
					
					return new int[] {i,j};
					
				}
			}
		}
		throw new IllegalArgumentException("Sorry , No Two sum solution!");
	}
	/**
	 * 时间复杂度：O(n)  空间复杂度：O(n)
	 * 
	 * 先进行第一次循环，将所有数组元素放入哈希表中
	 * 
	 * 第二次循环在哈希表中进行查找出能与第 i 个数组元素相加等于target目标值数值的非自身数组元素
	 * @param nums
	 * @param target
	 * @param map
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target , Map<Integer, Integer> map) {
		//将数组存放与Map中
		for(int i = 0; i < nums.length; i++) {
			//key为值,value为位置
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			//每次计算出与之相减,也就是所需那个两数相加的另一个未知数字
			int complement = target - nums[i]; 
			//如果Map中有这个key值,并且不是其自身
			if (map.containsKey(complement) && map.get(complement) != i) {
				//返回这两个值的下标
				return new int[] {i ,map.get(complement)};
			}
		}
		throw new IllegalArgumentException("Sorry , No Two sum solution!");
	}
	/**
	 * 输出格式规范
	 * 
	 * 相当与Arrays.toString(result)
	 * @param result
	 */
	public static void toResult(int[] result) {
		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			if (i == result.length -1) {
				System.out.print(result[i]);
			}else {
				System.out.print(result[i]+",");
			}
		}
		System.out.print("]");
	}
}
