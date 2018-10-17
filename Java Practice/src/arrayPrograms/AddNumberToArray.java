package arrayPrograms;

import java.util.Arrays;

public class AddNumberToArray {

	public static void main(String[] args) {
		int[] num = {3,4,5,67,8,5,54};
		int position= 6;
		System.out.println("length is "+num.length);
		int value=34;
		
//		for (int i = num.length-1; i > 4; i--) {
//		}
		num[position]=value;
		System.out.println(Arrays.toString(num));
	}
}
