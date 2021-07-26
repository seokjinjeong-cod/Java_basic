package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*(-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		treeSet.add("유재석");
		treeSet.add("강호동");
		treeSet.add("박명수");
		
		for(String s : treeSet) {
			System.out.println(s);
		}
	}
}