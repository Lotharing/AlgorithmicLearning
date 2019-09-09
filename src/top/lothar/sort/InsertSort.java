package top.lothar.sort;

import java.util.Arrays;

/**
  *  插入排序
 * @author 随心瑜
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		
		int[] data = {3,1,4,2,7,8,6,5};
		
		System.out.println(Arrays.toString(insertSort(data)));
	}
	
	public static int[] insertSort(int[] array) {
		
		int i,j,temp;
		//从第二个数开始依次往后，每次拿一个跟已排序的对比
		for(i=1;i<array.length;i++) {
			
			temp=array[i];
			//控制遍历 已排序序列
			for(j=i-1;j>=0;j--) {
				
				if(temp>array[j]) {
					break;
				}else {
					array[j+1]=array[j];
				}
			}
			array[j+1]=temp;
		}
		return array;
	}
}
