package top.lothar.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * ��ת�ַ����е�Ԫ����ĸ
 * 
 * @author LT
 * 
 * ˫ָ��
 *
 */
public class ReverseVowels {
	
    public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}
	
	//Ԫ����ĸ��
    private final static  Set<Character> set=new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    
    public static String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char []res=new char [j+1];
        while(i<=j){
            char chi=s.charAt(i);
            char chj=s.charAt(j);
            if(!set.contains(chi)){
            	//�ȸ�ֵ��i ���ۼ�
                res[i++]=chi;
            }else if(!set.contains(chj)){
            	//�ȸ�ֵ��j ���ۼ�
                res[j--]=chj;
            }else {
            	//�� ��λ���ֵ�Ԫ��λ�û���
                res[i++]=chj;
                res[j--]=chi;
            }
        }
        return new String(res);
    }
}

