package by.multidimensionalarray.java.main;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayTask10 {

	public static void main(String args[]) {
		int m;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����������� ���������� ������� = ");
		m = sc.nextInt();
		sc.close();

		int[][] ar = new int[m][m];
		init(ar);

		System.out.println();
		System.out.println("������������� �������� ������� ���������: ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if ((i == j) && (ar[i][j] > 0)) {
					System.out.print(ar[i][i] + " ");
				}
			}

		}

	}

	public static void init(int mas[][]) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(9) - 3;
				System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();

		}

	}

}