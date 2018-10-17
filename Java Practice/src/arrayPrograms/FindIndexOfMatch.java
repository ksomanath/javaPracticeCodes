package arrayPrograms;

import java.util.Arrays;

public class FindIndexOfMatch {

	// method to find array index
	public void finIndex(int[] num, int value) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] == value) {
				System.out.println("index is " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {

		int[] num = { 34, 45, 966, 78, 98 };

		int max = num[0];

		for (int i = 1; i < num.length; i++) {

			if (num[i] > max)
				max = num[i];
		}
		System.out.println("max number is " + max);
		
		System.out.println("max number is " + Arrays.toString(num));

		// using method to find array index
		int[] values = { 45, 54, 56, 56, 76, 76, 78, 89, 89, 849 };

		FindIndexOfMatch obj = new FindIndexOfMatch();
		obj.finIndex(values, 89);

	}
}
