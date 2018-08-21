package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
	/**
	 * Reverse of String of a line when occurence of char 't' either 1 or 3
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		List<String> reverseWords = reverseWords(str);
		System.out.println(reverseWords.toString());
	}

	static List<String> reverseWords(String line) {
		List<String> list = new ArrayList<String>();

		if (line.contains("t")) {

			String[] strArray = line.split(" ");
			for (String str : strArray) {
				String reverse = "";
				char[] charArray = str.toCharArray();
				int count = 0;
				int i = 1;
				for (char ch : charArray) {
					if (ch == 't') {
						count = count + 1;
					}
					reverse = reverse + charArray[charArray.length - i];
					i++;
				}
				if (count == 1 || count == 3) {
					list.add(reverse);
				}
			}
		} else {
			list.add("None");
		}

		return list;
	}
}
