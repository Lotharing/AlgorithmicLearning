package top.lothar.sort;

import java.util.Arrays;

/**
  *  ��������
 * @author �����
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		
		int[] data = {3,1,4,2,7,8,6,5};
		
		System.out.println(Arrays.toString(insertSort(data)));
	}
	
	public static int[] insertSort(int[] array) {
		
		int i,j,temp;
		//�ӵڶ�������ʼ��������ÿ����һ����������ĶԱ�
		for(i=1;i<array.length;i++) {
			
			temp=array[i];
			//���Ʊ��� ����������
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
