package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("이순신");
//		studentLee.studentName = "이순신";
		studentLee.address = "대구";
		
		studentLee.showStudentinfo();
		
		Student studentKim = new Student(100, "김유신");
//		studentKim.studentName = "김유신";
//		studentKim.address = "대전";
		
		studentKim.showStudentinfo();
		
//		System.out.println(studentLee);
//		System.out.println(studentKim);
		
	}

}
