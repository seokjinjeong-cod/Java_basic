package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberPark = new Member(102, "Park");
		Member memberLee = new Member(103, "Lee");
		Member memberKim = new Member(101, "Kim");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
	}
}
