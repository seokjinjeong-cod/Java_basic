package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "�뱸";
		
		studentLee.showSutdentinfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showSutdentinfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
