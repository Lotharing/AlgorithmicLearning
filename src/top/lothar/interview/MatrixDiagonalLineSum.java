package top.lothar.interview;

import java.util.Scanner;

/**
 * ��ά�������Խ���֮��
 * @author ��·ͨ
 *
 */
public class MatrixDiagonalLineSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] a = new int[3][3];
		//¼���ά����
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j]=input.nextInt();
			}
		}
		//�����ά����
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("\n");
		}
		int sum = 0;
		//����Խ��ߺ�
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if (i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("�Խ���������֮��Ϊ"+sum);
	}

}
