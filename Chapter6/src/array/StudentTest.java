package array;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("영어", 55);
		
		Student studentKim = new Student(1002, "Kim");

		studentKim.addSubject("국어", 95);
		studentKim.addSubject("수학", 95);
		studentKim.addSubject("영어", 80);
		
		studentLee.showStudentInfo();
		System.out.println("=======================================");
		studentKim.showStudentInfo();
	}

}
