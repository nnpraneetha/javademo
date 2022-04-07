package arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {
	public static void main(String[] args) {
		List<String> places=new LinkedList<String>();
		places.add("kerala");
		places.add("australia");
		places.add("mumbai");
		places.add("svn");
		places.add("guntur");
		
		System.out.println(places.contains("svn"));
		System.out.println(places.indexOf("guntur"));
		
		//printlist(places);
		//printlist(places);
		//printlist2(places);
		//printlist3(places);

	}
	
	private static void printlist(List<String> l) {
		Iterator<String> it= l.iterator();
		while(it.hasNext()) {
			String ele = it.next();
			System.out.println("now visiting  "+ ele);
			if(ele=="mumbai") {
				it.remove();
			}
			
		}
		System.out.println("-------------------------------");
	}
	private static void printlist2(List<String> l) {
		for(String s:l) {
			System.out.println("now visiting  "+s);
			/*if(s=="mm") {
				l.remove(s);
			}  gives error it will not work   */
		}
		System.out.println("-------------------------------");
	}
	
	private static void printlist3(List<String> l) {
		for(Iterator<String> it=l.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
