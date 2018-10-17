package arrayPrograms;

public class calculateAvarage {

	public static void main(String[] args) {
		double sum=0;
		double [] numbers= {13,35,65,57,78,89,89,59.78};
		
//		for (int i = 0; i < numbers.length; i++) {
//			sum= (numbers[(int) i]+sum);
//		}
		
		for (double d : numbers) {
			sum =d+sum;
		}
		
		System.out.println( "total sum is " +sum);
		double avarage=sum/numbers.length;
		System.out.println("avarage is : " +avarage);
		
	}
}
