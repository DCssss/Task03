package by.multidimensionalarray.java.main;

import java.util.Random;
import java.util.Scanner;

//���� �������. ������� k-� ������ � p-� ������� �������.

public class MultiArrayTask2 {

	public static void main(String args[]) {
		int k = 0;
		int p = 0;
		int s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ = ");
		k = sc.nextInt();
		System.out.println("������� ������� = ");
		p = sc.nextInt();
		sc.close();
		int i = 4;
		int j = 4;
		int[][] ar = new int[i][j];
		init(ar);

		if ((k < i) & (p < j)) {
			s = ar[k][p];
			System.out.println("�������� �������� ������� = " + s);
		} else {
			System.out.println("��� ������� �������");
		}

	}

	public static void init(int mas[][]) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(8) + 1;
				System.out.print(" a[" + i + j + "]=" + mas[i][j]);
			}
			System.out.println();

		}

	}
}