package practice;

import java.util.Scanner;

public class PermutationOfStringChar {

	/***
	 * Anagram : Each Permutation of each characters in String as below.
	 * Permutations for ABC are: [ACB, ABC, BCA, CBA, CAB, BAC]
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		permutate(string, 0, string.length()-1);
	}

	static void permutate(String str, int l, int r) {

		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i < str.length(); i++) {

				str = swap(str, l, i);
				permutate(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	static String swap(String s, int i, int j) {
		char temp;
		char[] a = s.toCharArray();
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return String.valueOf(a);
	}
}
