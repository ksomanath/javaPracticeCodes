package arrayPrograms;


/*Valid array declaration
 *   int[][] x;
 *   int[]  []x;  
 *   int [][]x;
 *   int x[][];
 *   int []x[];
 *   
 */ 
public class TwoDArray {

	int[][] a= {{32,333,34},{34,34,34},{34,45,46}};
	
	public static void main(String[] args) {
	
		int[][] a= {{32,33,34},{34,34,34},{34,45,46}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+ "  | ");
			}
			System.out.println();
		}
	}
}
