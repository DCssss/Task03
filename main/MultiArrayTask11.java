package by.multidimensionalarray.java.main;

import java.util.Random;

public class MultiArrayTask11 {
	public static void main(String args[]) {

		int[][] ar = new int[10][20];
		init(ar);

		System.out.println();
		int cnt = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if ((ar[i][j] == 5)&&(i != i+1)) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				System.out.println("Строка " + (i));
			}
		}

	}

	public static void init(int mas[][]) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(7);
				System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();

		}

	}
}