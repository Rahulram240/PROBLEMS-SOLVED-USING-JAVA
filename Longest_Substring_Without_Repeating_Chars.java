package Longest_Substring;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Chars {
	public static void main(String[] a) {
		String s = generate();
		System.out.println("String => " + s);
		System.out.println("\nThe Longest Substring without Repeating Character is " + maxlengthsubstr(s));

	}

	private static Integer maxlengthsubstr(String s) {
		int l = 0, max = 0;
		Set<Character> hs = new HashSet<>();
		for (int r = 0; r < s.length(); r++) {
			char val = s.charAt(r);
			while (hs.contains(val)) {
				hs.remove(s.charAt(l));
				l++;
			}
			hs.add(val);
			max = Math.max(max, r - l + 1);
		}
		return max;
	}

	private static String generate() {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random r = new Random();
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < (int) (Math.random() * 30 + 1); i++) {
			str.append(chars.charAt(r.nextInt(chars.length())));
		}

		String result = str.toString();

		return result;
	}
}
