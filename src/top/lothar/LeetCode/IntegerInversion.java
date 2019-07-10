package top.lothar.LeetCode;
/**
 * 
 * @author 赵路通
 * 
  *  整数反转 
 *  
  *  输入: 321  输出：123
 *  
  *  输入: -321  输出：-123
 *  
  *  输入: 120  输出：21
 *
 */
public class IntegerInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result  = reverse(123456);
		System.out.println(result);
	}

	 public static int reverse(int x) {
	        long y = x;
	        long res = 0;
	        do{
	            res = 10*res + y % 10;
	        }while((y /= 10) != 0);
	        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
	            return 0;
	        }
	        return (int)res;
	 }
}
