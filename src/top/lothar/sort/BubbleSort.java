package top.lothar.sort;
/**
 * 
 * @author 赵路通
 * 
 * 冒泡排序 
 * 
 * 平均时间复杂度  O(n²) 稳定
 * 
 * 算法步骤：
 * 
 *		比较相邻的元素。如果第一个比第二个大，就交换他们两个（升序）
 *
 *		对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数
 *
 *		针对所有的元素重复以上的步骤，除了最后一个
 *
 *		持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 *
 */
public class BubbleSort {
	
	public static void bubbleSort(int[] data){
		//依次每次拿出一个数
		for(int i=0; i<data.length-1;i++){
			//和后边的数比较大小
			for(int j=0; j<data.length-1;j++){
				
				if(data[j]>data[j+1]){
					int temp = data[j];
					
					data[j] = data[j+1];
					
					data[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int data[] = {22,34,12,32,50,67,43,32};
		System.out.println("------排序前------");
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]+" ");
		}
		System.out.println();
		bubbleSort(data);
		System.out.println("------排序后------");
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]+" ");
		}
	}

}
