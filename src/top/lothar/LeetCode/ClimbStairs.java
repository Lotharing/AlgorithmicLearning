package top.lothar.LeetCode;
/**
 * 
 * @author ��·ͨ
 * 
 * �и�N��¥�ݣ�ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 *
 */
public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(5));
	}
	
	public static int climbStairs(int n) {
        int f[]=new int[n+1];
        for(int i=1;i<n+1;i++){
          if(i<3){
             f[i]=i;
          }else{          
             f[i]=f[i-1]+f[i-2];                  
          }
        }
        return f[n];       
    }
}
