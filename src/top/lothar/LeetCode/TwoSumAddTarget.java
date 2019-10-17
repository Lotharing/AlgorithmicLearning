package top.lothar.LeetCode;

import java.util.Arrays;

/**
 * ��Ŀ�������������������ҳ���������ʹ���ǵĺ�Ϊ target��
 * 
 * @author LT
 * 
 * ˫ָ��˼��
 *
 */
public class TwoSumAddTarget {
	
	public static void main(String[] args) {
		int [] data = {2,7,11,16,17};
		int target = 18;
		int[] result = twoSum(data, target);
		System.out.println("[λ��,λ�ã�ֵ��ֵ]-->"+Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] numbers , int target) {
		int i = 0 , j  = numbers.length-1;
		while(i < j) {
			//��β���
			int sum = numbers[i]+numbers[j];
			if (sum==target) {
				//ֱ�������ǰ�����з���������λ�ú�ֵ
				return new int[] {i + 1,j + 1,numbers[i],numbers[j]};
			}else if(sum < target) {
				//�����������˼�ֵ����ӻ�С�����ƶ�i"ָ����һλ"
				i++;
			}else {
				//�����������˼�ֵ����ӽϴ����ƶ�j"ָ��ǰһλ"
				j--;
			}
		}
		return null;
	}
}
