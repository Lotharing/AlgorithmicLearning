package top.lothar.LeetCode;
/**
 * 
 * @author ��·ͨ
 * 
  *  ������ת 
 *  
  *  ����: 321  �����123
 *  
  *  ����: -321  �����-123
 *  
  *  ����: 120  �����21
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
