package top.lothar.interview;

import java.util.Scanner;

/**
 * 二维数组矩阵对角线之和
 * @author 赵路通
 *
 */
public class MatrixDiagonalLineSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] a = new int[3][3];
		//录入二维数组
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j]=input.nextInt();
			}
		}
		//输出二维数组
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("\n");
		}
		int sum = 0;
		//计算对角线和
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if (i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("对角线上数字之和为"+sum);
	}

}
