package top.lothar.classical;
/**
 * 
 * @author ��·ͨ
 * 
 * 쳲���������--> 1 1 2 3 5 8 13
 * 
 * ����ľ���ǰ����֮�͵��ڵ�������
 *
 */
public class FeiBoNaQieShuLie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������鳤�ȣ�������ж���λ
		int n = 10;
		//��������
		long[] result = generateFibonaccis(n);
		//�������
		for (int i = 0; i < n; i++) {
			System.out.print(" "+result[i]);
		}
		
	}
	
	public static long[] generateFibonaccis(int n) {
		//����ʱָ�����鳤��
		long[] fib = new long[n];
		//�趨һ��λ����ֵ
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < n; ++i) {
			//ǰ����֮��
			fib[i] = fib[i - 2] + fib[i -1]; 
		}
		return fib;
	}
	
}
