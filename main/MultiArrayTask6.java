package by.multidimensionalarray.java.main;

import java.util.Scanner;

public class MultiArrayTask6 {

	public static void main(String args[]) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размерность квадратной матрицы n =  ");
		n = sc.nextInt();
		sc.close();
		if (n % 2 == 0) {

			int[][] ar = new int[n][n];
			init(ar);
		} else {
			System.out.println("n нечетное");
		}
	}

	public static void init(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			if (i == 0 || i == mas.length - 1) {
				for (int j = 0; j < mas.length; j++) {
					mas[i][j] = 1;
				}
			} else {
				mas[i][0] = 1;
				mas[i][mas[i].length - 1] = 1;
			}

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}

	}
}
