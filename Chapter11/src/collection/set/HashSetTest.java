package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("유재석");
		set.add("박명수");
		set.add("강호동");
		set.add("유재석");
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.println(s);
		}
	}
}
