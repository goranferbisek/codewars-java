package kata6kyu;

import java.util.Arrays;

public class SumsOfParts {

	public static int[] sumParts(int[] ls) {
		int[] sumParts = new int[ls.length + 1];

		sumParts[0] = Arrays.stream(ls).sum();
		for (int i = 1; i < sumParts.length; i++) {
			sumParts[i] = sumParts[i - 1] - ls[i - 1];
		}
		return sumParts;
	}

	public static void main(String[] args) {
		int[] ls = { 0, 1, 3, 6, 10 };

		int[] sums = sumParts(ls);
		for (int i = 0; i < sums.length; i++) {
			System.out.println(sums[i]);
		}
	}

}
