package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("�̼���");
//		studentLee.studentName = "�̼���";
		studentLee.address = "�뱸";
		
		studentLee.showStudentinfo();
		
		Student studentKim = new Student(100, "������");
//		studentKim.studentName = "������";
//		studentKim.address = "����";
		
		studentKim.showStudentinfo();
		
//		System.out.println(studentLee);
//		System.out.println(studentKim);
		
	}

}
