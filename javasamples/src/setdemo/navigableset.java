package setdemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableset {
	public static void main(String[] args) {
		
		NavigableSet<Integer> s=new TreeSet<Integer>();
		s.add(74);
		s.add(23);
		s.add(89);
		s.add(5);
		System.out.println(s);
		System.out.println(s.lower(74));
		System.out.println(s.floor(74));
		System.out.println(s.higher(74));
		System.out.println(s.ceiling(74));
		System.out.println(s.first()+" "+s.last());
		System.out.println(s.descendingSet());
		NavigableSet<Integer> h= s.headSet(74,true);
		h.add(6);
		System.out.println(h);
		System.out.println(s);
	}
}
