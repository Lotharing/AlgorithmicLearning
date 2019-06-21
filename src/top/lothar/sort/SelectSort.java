package top.lothar.sort;

import java.util.Arrays;

/**
 * 
 * @author 赵路通
 *
 * 算法步骤：
 *
 *	首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *
 *	再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
 *
 *	重复第二步，直到所有元素均排序完毕
 *
 *  时间复杂度： O(n²)
 *  
 *  空间复杂度： O(1)
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,5,2,1,4};
		
		int[] result = selectSort(data);
		
		System.out.println("排序完成"+Arrays.toString(result));
	}
	
	public static int[] selectSort(int[] data) {
		//共有N-1躺比较
		for(int i = 0; i < data.length-1; i++) {
			//记录当前比对位置
			int min = i;
			//每轮需要比较的次数N-i
			for(int j = i +1; j < data.length; j++) {
				//如果往后数字小于当前参照数字，记录这个小数字下标
				if(data[j]<data[min]) {
					min = j;
				}
			}
			//将找到的最小值与i所在位置进行交换
			if(i!=min) {
				int temp = data[i];
				data[i] = data[min];
				data[min] = temp;			
			}
			System.out.println("第"+(i+1)+"趟"+Arrays.toString(data));
		}
		return data;
	}
	
}
