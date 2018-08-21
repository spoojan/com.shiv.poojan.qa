package practice;

import java.util.Scanner;

public class Series {
	/**
	 * Series: a+(2^n-1)*b
	 * @param argh
	 */
	public static void main(String[] argh) {
		//// int[] series2 = series2(2, 0, 0);
		//// int[] series2 = series2(5, 3, 5);
		// int[] series2 = series2(0, 2, 10);
		// for (int i = 0; i < series2.length; i++) {
		// System.out.print(series2[i] + " ");
		// }

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int[] series2 = series2(a, b, n);
			for (int j = 0; j < series2.length; j++) {
				System.out.print(series2[j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

	static void series(int a, int b, int n) {
		for (int k = n; k > 0; k--) {
			int sum = 0;
			for (int i = 0; i < k; i++) {
				int x = 1;
				if (i == 0) {
					x = 1;
					sum = x;
				} else {
					// int x1 = 1;
					int y = 1;
					for (int j = 0; j < i; j++) {
						y = 2 * y;
					}
					sum = sum + y;
				}
			}
			System.out.print(sum * b + " ,");
		}
	}

	static int[] series2(int a, int b, int n) {
		int finalVal;
		int[] elements;

		if (n > 0) {
			elements = new int[n];
			for (int k = 1; k < n + 1; k++) {
				int sum = 0;
				for (int i = 0; i < k; i++) {
					int x = 1;
					if (i == 0) {
						x = 1;
						sum = x;
					} else {
						// int x1 = 1;
						int y = 1;
						for (int j = 0; j < i; j++) {
							y = 2 * y;
						}
						sum = sum + y;
					}
				}
				finalVal = (sum * b) + a;
				// System.out.print(finalVal + " ");
				elements[k - 1] = finalVal;
			}
		} else {
			elements = new int[1];
			finalVal = a + b;
			elements[0] = finalVal;
		}
		return elements;
	}
}
