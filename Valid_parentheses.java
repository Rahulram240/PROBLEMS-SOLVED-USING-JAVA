package Longest_Substring;

import java.util.Random;
import java.util.Stack;

public class Valid_parentheses {
	public static void main(String[] a) {
		String str = generate();

		System.out.println("The String is => " + str);

		System.out.println("This string is " + validParen(str));
	}

	private static Boolean validParen(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(') {
					return false;
				}
				if (ch == ']' && top != '[') {
					return false;
				}
				if (ch == '}' && top != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private static String generate() {
		Random r = new Random();

		String open = "([{";
		String close = ")]}";

		int pairs = r.nextInt(5) + 1;

		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();

		for (int i = 0; i < pairs; i++) {
			int index = r.nextInt(3);

			left.append(open.charAt(index));
			right.insert(0, close.charAt(index));
		}

		return left.toString() + right.toString();
	}
}
