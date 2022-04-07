package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayutils {
	public static void main(String[] args) {
		String[] a=new String[] {"Raj","Anita"};
		List<String> s=Arrays.asList(a);
		System.out.println(s);
		s.set(0,"John");
		System.out.println("updated array:"+Arrays.toString(a));
		System.out.println("List: "+s);
		
		List<String> l=new ArrayList<String>();
		l.add("raj");
		l.add("john");
		l.add("max");
		
		String[] arr= {"anitha"};
		Collections.addAll(l, arr);
		System.out.println(l);
		
	}
}
