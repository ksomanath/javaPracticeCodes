package arrayPrograms;

public class AvarageOfArrayElement {
	
	public static void main(String[] args) {
		int [] a= {3,4,5,8,3,3};
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum =a[i]+sum;
		}
		System.out.println("avarage of all  array elements are " +sum/a.length);
	}
	

}
