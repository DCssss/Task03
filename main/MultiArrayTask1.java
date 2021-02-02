package by.multidimensionalarray.java.main;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на главной диагонали

public class MultiArrayTask1 {

	public static void main(String args[]) {

		int i = 4;
		int j = 4;
		int[][] ar = new int[i][j];
		init(ar);

		for (i = 0; i < ar.length; i++) {
			for (j = i; j < ar.length; j++) {
				if (i == j) {
					System.out.println();
					System.out.print(ar[i][j] + " ");
				}

			}

		}
	}

	public static void init(int mas[][]) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(8) + 1;
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}

	}
}