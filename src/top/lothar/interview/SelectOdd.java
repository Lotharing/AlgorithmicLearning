package top.lothar.interview;

import java.util.Arrays;
/**
 * 将数组中的奇数，都在偶放数前面
 * @author 赵路通
 *
 */
public class SelectOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(selectOdd(data)));
	}
	
	public static int[] selectOdd(int[] arr) {
		//0下标
		int i = 0;
		//数组最大下标
		int j = arr.length-1;	
		while(i < j) {
			//从前往后找第一个偶数
			while(i < j && arr[i]%2!=0) {
				i++;
			}
			//从后往前找到第一个奇数
			while(i < j && arr[j]%2==0) {
				j--;
			}		
			//交换奇数偶数位置
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}

}
