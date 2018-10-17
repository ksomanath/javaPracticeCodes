package arrayPrograms;

public class SingleDAraay 
{
	int[] numbers = new int[5];
	private static SingleDAraay obj;
	
	public static void main(String[] args) {
		setObj(new SingleDAraay());
		int number[]= {4,5,6,7,7,7,8};
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println(number.getClass().getName());

		
		double[] example = new double[4];
		example[1]=324;
		example[3]=324;
		
		
		for (int i = 0; i < example.length; i++) {
			System.out.println(example[i]);
		}

	}

	public static SingleDAraay getObj() {
		return obj;
	}

	public static void setObj(SingleDAraay obj) {
		SingleDAraay.obj = obj;
	}
}
