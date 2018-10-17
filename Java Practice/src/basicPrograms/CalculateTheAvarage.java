package basicPrograms;

public class CalculateTheAvarage {

	public static void main(String[] args) {
		double[] numbers = {34,234,34,54645,5476,68,678};
		double num = 0;
		for (int i = 0; i < numbers.length; i++) {
			num=num+numbers[i];
			
		}
		System.out.println("avarage is : " +num/numbers.length);
	}
}
