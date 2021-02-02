package by.multidimensionalarray.java.main;

import java.util.Random;
import java.util.Scanner;

//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.

public class MultiArrayTask3 {

	public static void main(String args[]) {
		int m;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку = ");
		m = sc.nextInt();
		System.out.println("Введите столбец = ");
		n = sc.nextInt();
		sc.close();

		int[][] ar = new int[m][n];
		init(ar);
		System.out.println("Измененный массив");
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 1) {
				for (int j = 0; j < ar.length; j++)
					System.out.print(ar[i][j] + " ");
			} else {
				for (int j = ar.length - 1; j >= 0; j--) {
					System.out.print(ar[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

	public static void init(int mas[][]) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(8) + 1;
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}

	}

}