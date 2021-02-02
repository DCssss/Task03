package by.multidimensionalarray.java.main;

public class MultiArrayTask9 {

	public static void main(String args[]) {
		System.out.println("Линейная последовательность");
		int[] mas = new int[] { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		int[][] mas2 = new int[mas.length][mas.length];
		mas2[0] = mas;
		for (int i = 1; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas2[0][j], i + 1);

			}
		}
		System.out.println("Полученная матрица");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("%10d ", mas2[i][j]);

			}
			System.out.println();

		}
	}
}