package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("���缮");
		treeSet.add("��ȣ��");
		treeSet.add("�ڸ��");
		
		for(String s : treeSet) {
			System.out.println(s);
		}
	}

}
