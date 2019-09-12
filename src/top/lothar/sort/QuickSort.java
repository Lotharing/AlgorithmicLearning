package top.lothar.sort;
/**
 * 快速排序
 * @author 赵路通
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] arr = {7,4,3,5,2,1,8,9};
	     quickSort(arr, 0, arr.length-1);
	     for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	     }
	}
	
	
	public static void quickSort(int[] data,int start,int end){
		if(start<end){
			//以第一个元素为分解值
			int middleNum = data[start];
			int i = start;
			int j = end + 1;
			while(true){
				//找到大于分解值的元素的索引，或者已经到了end处
				while(i<end && data[++i] < middleNum);
				//找到小于分界值的元素的索引或者已经到了start处
				while(j>start && data[--j] >= middleNum);
				if(i < j){
					//交换
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}else{
					break;
				}
			}
			int temp = data[start];
			data[start] = data[j];
			data[j] = temp;
			//递归左子序列
			quickSort(data, start, j-1);
			//递归右子序列
			quickSort(data, j+1, end);
		}
	}
	
}
