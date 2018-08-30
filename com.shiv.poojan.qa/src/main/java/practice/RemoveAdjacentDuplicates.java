package practice;

public class RemoveAdjacentDuplicates {
	public static void main(String[] args) {
		System.out.println(process("dddbbccc"));
		System.out.println(process("gaag"));
		System.out.println(process("adad"));
	}

	public static String process(String s) {
		char[] inputArray = s.toCharArray();
		int n = inputArray.length;
		int prevIndex = -1;

		for (int i = 0; i < n; i++) {
			if (prevIndex >= 0 && inputArray[i] == inputArray[prevIndex]) {
				// pop a character from the stack
				prevIndex--;
			} else {
				// push a character onto the stack
				prevIndex++;
				inputArray[prevIndex] = inputArray[i];
			}
		}

		return new String(inputArray, 0, prevIndex + 1);
	}

}
