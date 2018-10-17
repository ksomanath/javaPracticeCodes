package arrayPrograms;

public class AdditionOfTwoDArray {

	public static void main(String[] args) {
		int[][] a= {{3,3},{4,5},{5,2}};
		int[][] b= {{3,3},{4,5},{5,2}};
		
		int[][]c = new int[3][2];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] aa= {2,4,6,7} ;
		int sum=0;
		
		for (int i = 0; i < aa.length; i++) {
			sum=sum+aa[i];
		}
		System.out.println(sum);
	}
}
