package collections;

import java.util.HashMap;

public class HashMpaClear {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("no","7y5745743");
		hm.put("Name", "S");
		hm.put("Name", "");
		hm.put("7", "i");
		//hm.clear();
		System.out.println(hm.remove("Name"));
		System.out.println(hm.containsKey("uName"));
		System.out.println("=====================");
		System.out.println(hm.keySet());
		System.out.println("=====================");
		System.out.println("is hasmap empty : "+hm.isEmpty());
		System.out.println("=====================");
		System.out.println(hm.values());
		System.out.println("=====================");
		System.out.println(hm.size());
		System.out.println("=====================");
		System.out.println(hm.entrySet());
		
//		for (Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey() +" -- " +m.getValue());
//		}
		
		
	}
}
