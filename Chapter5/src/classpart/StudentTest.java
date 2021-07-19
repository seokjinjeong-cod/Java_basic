package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "대구";
		
		studentLee.showSutdentinfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "대전";
		
		studentKim.showSutdentinfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
