package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(101, "Kim");
		Member memberHeo = new Member(102, "Heo");
		Member memberHeo2 = new Member(102, "Heo2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberHeo);
		manager.addMember(memberHeo2);
		
		manager.showAllMember();
	}
}
