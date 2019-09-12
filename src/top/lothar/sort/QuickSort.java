package top.lothar.sort;
/**
 * ��������
 * @author ��·ͨ
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
			//�Ե�һ��Ԫ��Ϊ�ֽ�ֵ
			int middleNum = data[start];
			int i = start;
			int j = end + 1;
			while(true){
				//�ҵ����ڷֽ�ֵ��Ԫ�ص������������Ѿ�����end��
				while(i<end && data[++i] < middleNum);
				//�ҵ�С�ڷֽ�ֵ��Ԫ�ص����������Ѿ�����start��
				while(j>start && data[--j] >= middleNum);
				if(i < j){
					//����
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
			//�ݹ���������
			quickSort(data, start, j-1);
			//�ݹ���������
			quickSort(data, j+1, end);
		}
	}
	
}
