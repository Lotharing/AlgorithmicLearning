package top.lothar.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 反转字符串中的元音字母
 * 
 * @author LT
 * 
 * 双指针
 *
 */
public class ReverseVowels {
	
    public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}
	
	//元音字母表
    private final static  Set<Character> set=new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    
    public static String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char []res=new char [j+1];
        while(i<=j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(!set.contains(chi)){
            	//先赋值，i 在累加
                res[i++]=chi;
            }else if(!set.contains(chj)){
            	//先赋值，j 在累加
                res[j--]=chj;
            }else {
            	//将 首位出现的元音位置互换
                res[i++]=chj;
                res[j--]=chi;
            }
        }
        return new String(res);
    }
}

