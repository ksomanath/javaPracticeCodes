package arrayPrograms;

public class PassingArrayToMethod {
	
	static void maxvalue(int[]arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max > arr[i]) {
				max=arr[i];
				System.out.println(max);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a= {3,354,24,67,6,3244,34244};
		maxvalue(a);
	}

}
