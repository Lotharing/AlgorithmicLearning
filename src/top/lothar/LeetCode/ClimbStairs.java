package top.lothar.LeetCode;
/**
 * 
 * @author 赵路通
 * 
 * 有个N阶楼梯，每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
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
