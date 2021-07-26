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
		treeSet.add("���缮");
		treeSet.add("��ȣ��");
		treeSet.add("�ڸ��");
		
		for(String s : treeSet) {
			System.out.println(s);
		}
	}
}