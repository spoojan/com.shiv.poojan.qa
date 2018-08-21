package practice;

import java.util.Arrays;

public class VersionCompare {

	public static void main(String[] args) {

		System.out.println(version("1.2.3", "1.2.3.1"));

		System.out.println(version("1.4.3", "1.03.2"));

		System.out.println(version("1.01.3", "1.03.2"));

	}

	public static String version(String str1, String str2) {
		System.out.println("version1=" + str1 + " ## version2=" + str2);
		String[] version1 = str1.split("\\.");
		String[] version2 = str2.split("\\.");
		int length = Math.min(version1.length, version2.length);
		char[] v1CharArray = str1.toCharArray();
		char[] v2CharArray = str2.toCharArray();
		if (Arrays.equals(v1CharArray, v2CharArray)) {
			return "Both Version are equal";
		} else {
			String major_minor = "";
			for (int i = 0; i < length; i++) {

				if (Integer.parseInt(version1[i]) >= Integer.parseInt(version2[i])) {
					major_minor = str1 + "::Version1 is major";

				} else {
					major_minor = str1 + "::Version1 is minor";
					break;
				}

			}

			return major_minor;
		}
	}
}
