package by.multidimensionalarray.java.main;

import java.util.Scanner;

public class MultiArrayTask8 {

	public static void main(String args[]) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����������� ���������� ������� n =  ");
		n = sc.nextInt();
		sc.close();
		if (n % 2 == 0) {

			int[][] ar = new int[n][n];
			init(ar);

		} else {
			System.out.println("n ��������");
		}
	}

	public static void init(int mas[][]) {
		int m = mas.length;
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = 0; j < mas[i].length - i; j++) {
				mas[i][j] = m + j;

			}
			m--;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}

	}

}