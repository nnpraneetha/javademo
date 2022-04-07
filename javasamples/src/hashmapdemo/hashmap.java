package hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {

		public static void main(String[] args) {
			
			Map<String, Integer> m=new HashMap<String, Integer>();
			m.put("john", 25);
			m.put("Max", 29);
			m.put("Raj", 35);
			System.out.println(m);
			m.put("Max", 31);
			System.out.println(m);
			
			System.out.println("is john there :"+m.containsKey("john"));
			System.out.println("rag age:"+m.get("Raj"));
			System.out.println("keys"+m.keySet());
			System.out.println("values:"+m.values());
			
			Set<String> n=m.keySet();
			for (String ns:n) {
				System.out.println("Name: "+ns+", Age: "+m.get(ns));
			}
			
			//Map of maps
			Map<String, Map<String, Object>> up=new HashMap<String, Map<String, Object>>();
			Map<String, Object> p=new HashMap<String,Object>();
			p.put("age", 25);
			p.put("dept", "Admin");
			p.put("city","Houston");
			up.put("Michael",p);
			System.out.println(p);
			System.out.println(up);
			System.out.println(up.containsValue(p));
			
		}
}
