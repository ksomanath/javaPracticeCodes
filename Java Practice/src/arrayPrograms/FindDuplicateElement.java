package arrayPrograms;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int[] number = {3,5,6,5,7,6,3,4,4};
			
		for (int i = 0; i < number.length-1; i++) {
			for (int j = i+1; j < number.length; j++) {
				if (number[i]==number[j] && (i!=j)) {
					System.out.println(number[j]);
					
				}
			}
		}
	}

}
