package top.lothar.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ��·ͨ
 * 
  * ��Ŀ���ݣ�
 * 
 * 		����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±�
 *
 * 		����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ��
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
	 * ʱ�临�Ӷȣ�O(n^2)   �ռ临�Ӷȣ�O(1)
	 * �����������,ֱ�ӱ���������������������ڳ˷��ھ�����㷨
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
	 * ʱ�临�Ӷȣ�O(n)  �ռ临�Ӷȣ�O(n)
	 * 
	 * �Ƚ��е�һ��ѭ��������������Ԫ�ط����ϣ����
	 * 
	 * �ڶ���ѭ���ڹ�ϣ���н��в��ҳ������ i ������Ԫ����ӵ���targetĿ��ֵ��ֵ�ķ���������Ԫ��
	 * @param nums
	 * @param target
	 * @param map
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target , Map<Integer, Integer> map) {
		//����������Map��
		for(int i = 0; i < nums.length; i++) {
			//keyΪֵ,valueΪλ��
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			//ÿ�μ������֮���,Ҳ���������Ǹ�������ӵ���һ��δ֪����
			int complement = target - nums[i]; 
			//���Map�������keyֵ,���Ҳ���������
			if (map.containsKey(complement) && map.get(complement) != i) {
				//����������ֵ���±�
				return new int[] {i ,map.get(complement)};
			}
		}
		throw new IllegalArgumentException("Sorry , No Two sum solution!");
	}
	/**
	 * �����ʽ�淶
	 * 
	 * �൱��Arrays.toString(result)
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
