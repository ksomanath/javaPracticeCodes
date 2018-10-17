package basicPrograms;

import java.util.Scanner;

/**
 * 
 * @author Somanath 
 * This program will help you identify even or odd number.
 */

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(+number + " is even number");
		}
		else {
			System.out.println(+number + " is odd number");
		}
		scanner.close();
	}
}
