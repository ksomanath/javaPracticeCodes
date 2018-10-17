package arrayPrograms;

public class VerifySpecificValue {

	public static void main(String[] args) {
		int[] num = {34,45,667,78,98};
		
		char[] text = {'w','y','e'};
		
		for (int i = 0; i < num.length; i++) {
			if (text[i]=='e') {
				System.out.println("match found");
				break;
			}
			
		}
		
		
	}
}
