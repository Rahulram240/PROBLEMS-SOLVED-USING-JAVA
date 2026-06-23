package Valid_Palindrome;

import java.util.Random;

public class Valid_palindrome {
	public static void main(String[] a) {
		String str = generate();

		System.out.println("String => " + str);

		System.out.println("This is a " + verifyPalindrome(str));

	}

	private static String verifyPalindrome(String str) {
		int l = 0, r = str.length() - 1;
		while (l < r) {
			while (l < r && !Character.isLetterOrDigit(str.charAt(l))) {
				l++;
			}

			while (l < r && !Character.isLetterOrDigit(str.charAt(r))) {
				r--;
			}

			if (Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))) {
				return "not a Palindrome";
			}
			l++;
			r--;
		}
		return "is a Palindrome";
	}

	public static String generate() {
		String str = "abcdefghijklmnopqrstuvwxyz";

		Random r = new Random();
		StringBuilder pali = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			pali.append(str.charAt(r.nextInt(str.length())));
		}
		String result = null;
		if (r.nextBoolean()) {
			result = pali.toString() + new StringBuilder(pali).reverse().toString();
		} else {
			result = pali.toString();
		}

		return result;

	}
}
