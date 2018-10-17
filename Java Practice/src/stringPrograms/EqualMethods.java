package stringPrograms;

public class EqualMethods {

	public static void main(String[] args) {
		String s1 = new String("Somanath");
		String s2 = new String("Somanath");

		System.out.println(s1.equals(s2));
		//  in string class .equals() is overridden for content comparison. hence even though content is same .equals() returns true.

		StringBuffer s3 = new StringBuffer("Somanath");
		StringBuffer s4 = new StringBuffer("Somanath");

		System.out.println(s3.equals(s4));
		//  in stringbuffer class .equals() is not overridden for content comparison, it compares reference variable(address comparison) . hence even though content is same .equals() returns true.

	}

}
