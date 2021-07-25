package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("유재석");
		treeSet.add("강호동");
		treeSet.add("박명수");
		
		for(String s : treeSet) {
			System.out.println(s);
		}
	}

}
