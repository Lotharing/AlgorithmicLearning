package top.lothar.interview;
/**
 * 二分查找
 * 
 * 优点是比较次数少，查找速度快，平均性能好
 * 
 * 其缺点是要求待查表为有序表，且插入删除困难
 * 
 * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表
 * 
 * @author 赵路通
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9,11};
		int key = 9;
		int position = recursionBinarySearch(arr,key,0,arr.length-1);
        if(position == -1){
			System.out.println("查找的是"+key+",序列中没有该数！");
		}else{
			System.out.println("查找的是"+key+",下标位置为："+position);
		}

	}
	/**
	 * 递归
	 * @param arr	有序序列
	 * @param key	待查找数字
	 * @param low	最小下标
	 * @param high	最大下标
	 * @return
	 */
	public static int recursionBinarySearch(int arr[],int key,int low,int high) {
		if (key < arr[low] || key > arr[high] || low > high) {
			return -1;
		}
		//序列中间位置
		int middle = (low+high)/2;
		if (arr[middle] > key) {
			//比关键字大则关键字在左区域
			return recursionBinarySearch(arr, key, low, middle-1);
		}else if (arr[middle] < key) {
			//比关键字小则关键字在右区域
			return recursionBinarySearch(arr, key, middle+1, high);
		}else {
			return middle;
		}
	}
	
	/**
	 * 不使用递归
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int commonBinarySearch(int[] arr,int key){
		int low = 0;
		int high = arr.length - 1;
		int middle = 0;			//定义middle
		
		if(key < arr[low] || key > arr[high] || low > high){
			return -1;				
		}
		
		while(low <= high){
			middle = (low + high) / 2;
			if(arr[middle] > key){
				//比关键字大则关键字在左区域
				high = middle - 1;
			}else if(arr[middle] < key){
				//比关键字小则关键字在右区域
				low = middle + 1;
			}else{
				return middle;
			}
		}	
		return -1;
	}

}
