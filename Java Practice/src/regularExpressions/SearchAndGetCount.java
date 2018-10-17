package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchAndGetCount {

	public static void main(String[] args) {
		int count=0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abfjdksfjababifjirfjiodabab abaiejfifjwoieab");
		
		while (m.find()) {
			count++;
			System.out.println("start indexes : "+m.start()+"......."+m.end()+"......."+m.group());
		}
		System.out.println("total count is : "+count);
	}
}
