package by.multidimensionalarray.java.main;

import java.util.Scanner;



public class MultiArrayTask5 {

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
			for (int j = 0; j < mas.length; j++) {

				if (i + j + 1 == mas.length) {
					mas[i][j] = i + 1;
				}

				System.out.print(mas[i][j] + " ");
			}

			System.out.println();

		}

	}

}