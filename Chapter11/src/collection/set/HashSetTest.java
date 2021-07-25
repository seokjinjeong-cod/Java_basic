package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("���缮");
		set.add("�ڸ��");
		set.add("��ȣ��");
		set.add("���缮");
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.println(s);
		}
	}
}
