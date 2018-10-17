package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_AddNew {

	public static void main(String[] args) {
		
		ArrayList <String> names= new ArrayList<String>();
		
		names.add("Somanath");
		names.add("Vinayak");
		names.add("Prathamesh");
		
		System.out.println("first name is : "+names.get(0));
		System.out.println("second name is : "+names.get(1));
		
		names.add(1, "first name");
		System.out.println("updated first is : "+names.get(0));
		System.out.println("updated first is : "+names.get(1));
		System.out.println("second name is : "+names.get(2));
		System.out.println("third name is : "+names.get(3));
		
		
		System.out.println("size of arraylist : "+names.size());
		System.out.println(names.isEmpty());
		System.out.println("=============================");
		Iterator<String> itr=names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("names.clone()");
	}
}
