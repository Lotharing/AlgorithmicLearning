package top.lothar.classical;
/**
 * �ж�101-200֮���ж��ٸ��������������������
 * �ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)��
 * ����ܱ������� ���������������������֮��������  
 * @author ��·ͨ
 *
 */
public class JudgementPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        for(int i=101;i<200;i+=2) {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag==true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("һ����"+count+"��");
	}

}
