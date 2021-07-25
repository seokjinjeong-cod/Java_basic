package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberHeo = new Member(102, "Heo");
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(101, "Kim");
		Member memberHeo2 = new Member(103, "Heo2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberHeo);
		manager.addMember(memberHeo2);
		
		manager.showAllMember();
		
		manager.removeMember(101);
		manager.showAllMember();
	}
}
