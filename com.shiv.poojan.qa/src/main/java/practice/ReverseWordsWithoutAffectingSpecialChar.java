package practice;

import java.util.Arrays;

public class ReverseWordsWithoutAffectingSpecialChar {
	public static void main(String[] args) {
		String name = "My name  is shiv poojan";

		String reverse = reverse(name);
		System.out.println(reverse);
	}

	static String reverse(String s) {
		/**/
		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));

		String[] s2 = new String[s1.length - 1];
		int j = 0;
		for (int i = 0; i < s1.length; i++) {
			if (!s1[i].equals("")) { 
				s2[j++] = s1[i];
			}
		}
		System.out.println(Arrays.toString(s2));
		j = 0;
		for (int k = s2.length-1; k >= 0; k--) {
			if (s1[j].equals("")) {
				j++;
			} else {
				s1[j] = s2[k];
				j++;
			}
		}

		System.out.println(Arrays.toString(s1));
		return "";
	}
}
