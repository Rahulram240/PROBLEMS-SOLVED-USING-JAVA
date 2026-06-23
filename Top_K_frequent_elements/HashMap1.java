import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 10) + 1;
		System.out.println("Total Elements = " + n);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
			;
		}
		System.out.print("Elements = ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		int k = (int) (Math.random() * n) + 1;
		System.out.println("\nK = " + k);
		int res[] = new int[k];
		res = topKFreq(a, k);
		System.out.println("\nThe elements are =>");
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	public static int[] topKFreq(int[] a, int k) {
		Map<Integer, Integer> hm = new HashMap<>();

		for (int i : a) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		List<Integer>[] buck = new List[a.length + 1];
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
			int freq = e.getValue();
			int value = e.getKey();

			if (buck[freq] == null) {
				buck[freq] = new ArrayList<>();
			}
			buck[freq].add(value);
		}

		int res[] = new int[k];
		int bre = 0;
		for (int i = buck.length - 1; i >= 0; i--) {
			if (buck[i] != null) {
				for (int e : buck[i]) {
					res[bre] = e;
					bre++;

					if (bre == k) {
						return res;
					}
				}
			}
		}
		return new int[] { -1, -1 };
	}
}