package basicPrograms;

public class JavaGoToWithLabels {

	public static void main(String[] args) {

		outer:
		for (int i = 0; i < 6; i++) {
			System.out.println("Top loop number is : "+i);
			
			for (int j = 3; j < 10; j++) {
				if (j ==i) {
					System.out.println("numbers are equal");
					break outer;
				}

			}
		}
		System.out.println("final statement");
	}
}
