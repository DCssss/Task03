package by.multidimensionalarray.java.main;

import java.util.Scanner;



public class MultiArrayTask4 {

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

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = mas.length - j;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}

	}

}