
public class Stock_Leetcode {
	public static void main(String[] a) {

		int size = (int) (Math.random() * 10) + 1;

		System.out.println("The Size of an Array = " + size);

		int[] a1 = new int[size];

		for (int i = 0; i < size; i++) {
			a1[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.print("\nThe Elements is ");
		for (int i : a1) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nMaximum Profit is " + maxProfit(a1));
	}

	private static int maxProfit(int[] a) {
		int min = Integer.MAX_VALUE, max = 0;
		for (int i : a) {
			if (i < min) {
				min = i;
			}
			max = Math.max(max, i - min);
		}
		return max;
	}
}
