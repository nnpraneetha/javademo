package setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//both HashSet and LinkedHashSet provides uniqueness
//insertion order


public class Linkedhashset {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		hs.add("john");
		hs.add("alex");
		hs.add("max");
		hs.add("tracy");
		System.out.println(hs);
		
		Set<String> hs2=new LinkedHashSet<String>();
		hs2.add("john");
		hs2.add("alex");
		hs2.add("max");
		hs2.add("tracy");
		System.out.println(hs2);
		
	}
	
}
