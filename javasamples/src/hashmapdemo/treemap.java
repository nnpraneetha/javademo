package hashmapdemo;

import java.util.TreeMap;

public class treemap {
	
	public static void main(String[] args) {
		TreeMap<String,Integer> m=new TreeMap<String,Integer>();
		m.put("john", 25);
		m.put("max", 29);
		m.put("bob", 27);
		System.out.println(m);
	}
}
