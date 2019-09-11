package top.lothar.interview;
/**
 * ���ֲ���
 * 
 * �ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺ�
 * 
 * ��ȱ����Ҫ������Ϊ������Ҳ���ɾ������
 * 
 * ��ˣ��۰���ҷ��������ڲ������䶯������Ƶ���������б�
 * 
 * @author ��·ͨ
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9,11};
		int key = 9;
		int position = recursionBinarySearch(arr,key,0,arr.length-1);
        if(position == -1){
			System.out.println("���ҵ���"+key+",������û�и�����");
		}else{
			System.out.println("���ҵ���"+key+",�±�λ��Ϊ��"+position);
		}

	}
	/**
	 * �ݹ�
	 * @param arr	��������
	 * @param key	����������
	 * @param low	��С�±�
	 * @param high	����±�
	 * @return
	 */
	public static int recursionBinarySearch(int arr[],int key,int low,int high) {
		if (key < arr[low] || key > arr[high] || low > high) {
			return -1;
		}
		//�����м�λ��
		int middle = (low+high)/2;
		if (arr[middle] > key) {
			//�ȹؼ��ִ���ؼ�����������
			return recursionBinarySearch(arr, key, low, middle-1);
		}else if (arr[middle] < key) {
			//�ȹؼ���С��ؼ�����������
			return recursionBinarySearch(arr, key, middle+1, high);
		}else {
			return middle;
		}
	}
	
	/**
	 * ��ʹ�õݹ�
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int commonBinarySearch(int[] arr,int key){
		int low = 0;
		int high = arr.length - 1;
		int middle = 0;			//����middle
		
		if(key < arr[low] || key > arr[high] || low > high){
			return -1;				
		}
		
		while(low <= high){
			middle = (low + high) / 2;
			if(arr[middle] > key){
				//�ȹؼ��ִ���ؼ�����������
				high = middle - 1;
			}else if(arr[middle] < key){
				//�ȹؼ���С��ؼ�����������
				low = middle + 1;
			}else{
				return middle;
			}
		}	
		return -1;
	}

}
