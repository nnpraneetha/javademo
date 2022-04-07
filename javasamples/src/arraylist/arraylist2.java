package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylist2 {
		public static void main(String[] args) {
			
			List<IFlyable> flyingObjects = new LinkedList<IFlyable>();
			flyingObjects.add(new BoxCase("220B", "Dell",  "244"));
			flyingObjects.add(new Monitor("27 Inch", "Acer", 27));
			flyingObjects.add(new MotherBoard("BJ-200", "Asus", 4, 6, "v2.444"));
			
			for (int i=0; i<flyingObjects.size(); i++) {
				flyingObjects.get(i).fly();
			}
			
			for (IFlyable flyingObject : flyingObjects) {
				flyingObject.fly();
			}
			
			System.out.println("--------------------------------------------");
			
			List<String> strList = new ArrayList<String>();
			strList.add("Hello");
			strList.add("world");
			strList.add("java");
			strList.add("coding");
			strList.add("is fun");
			
			for (String s : strList)
				System.out.println(s);
			
			System.out.println("--------------------------------------------");
			
			List<Integer> intList = new ArrayList<Integer>();
			intList.add(4);
			intList.add(41);
			intList.add(42);
			intList.add(24);
			intList.add(34);
			for (Integer i : intList)
				System.out.println(i);
			
		}
		
	}
