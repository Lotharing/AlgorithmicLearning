package top.lothar.classical;
/**
 * 
 * @author 赵路通
 * 
 * 斐波那挈数列--> 1 1 2 3 5 8 13
 * 
 * 其核心就是前两数之和等于第三个数
 *
 */
public class FeiBoNaQieShuLie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组长度，输出数列多少位
		int n = 10;
		//生成数列
		long[] result = generateFibonaccis(n);
		//遍历输出
		for (int i = 0; i < n; i++) {
			System.out.print(" "+result[i]);
		}
		
	}
	
	public static long[] generateFibonaccis(int n) {
		//调用时指定数组长度
		long[] fib = new long[n];
		//设定一二位的数值
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < n; ++i) {
			//前两数之和
			fib[i] = fib[i - 2] + fib[i -1]; 
		}
		return fib;
	}
	
}
