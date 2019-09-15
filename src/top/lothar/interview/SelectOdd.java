package top.lothar.interview;

import java.util.Arrays;
/**
 * �������е�����������ż����ǰ��
 * @author ��·ͨ
 *
 */
public class SelectOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(selectOdd(data)));
	}
	
	public static int[] selectOdd(int[] arr) {
		//0�±�
		int i = 0;
		//��������±�
		int j = arr.length-1;	
		while(i < j) {
			//��ǰ�����ҵ�һ��ż��
			while(i < j && arr[i]%2!=0) {
				i++;
			}
			//�Ӻ���ǰ�ҵ���һ������
			while(i < j && arr[j]%2==0) {
				j--;
			}		
			//��������ż��λ��
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}

}
