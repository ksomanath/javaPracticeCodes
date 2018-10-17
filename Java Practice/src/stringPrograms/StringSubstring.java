package stringPrograms;

public class StringSubstring {
	// there are two method to get substring: substring(int startindex), substring (int startindex, int lastindex)
	
	public static void main(String[] args) {
		String s1= "somanathkumbhar";
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(0, 8));
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		System.out.println(sb);
	}
	
}
