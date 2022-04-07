package hashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
	
	public static void main(String[] args) {
//		Map<String, String> m=new LinkedHashMap<String,String>();
		Map<String, String> m=new LinkedHashMap<String,String>();

		m.put("B", "b");
		m.put("A", "a");
		m.put("C", "c");
		System.out.println(m);
		
		m.get("C");
		System.out.println(m);
		m.get("A");
		System.out.println(m);
		System.out.println("_____________________");
		Map<String, String> m2=new LinkedHashMap<String,String>(16,0.75f,true);

		m2.put("B", "b");
		m2.put("A", "a");
		m2.put("C", "c");
		System.out.println(m2);
		
		m2.get("C");
		System.out.println(m2);
		m2.get("A");
		m2.get("B");
		System.out.println(m2);
	}
}
