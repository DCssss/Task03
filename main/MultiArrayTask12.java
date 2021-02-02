package by.multidimensionalarray.java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MultiArrayTask12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество строк m =");
		int m = sc.nextInt();
		System.out.println("¬ведите количество строк n =");
		int n = sc.nextInt();
		sc.close();
		int[][] ar = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i)
					ar[i][j] = 1;
				else
					ar[i][j] = 0;
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrayList.add(ar[j][i]);
			}
			Collections.shuffle(arrayList);
			for (int j = 0; j < m; j++) {
				ar[j][i] = arrayList.get(j);
			}
			arrayList.clear();
		}
		System.out.println();
		for (int[] each : ar) {
			System.out.println(Arrays.toString(each));
		}
	}
}