package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		Student studentCho = new Student("Cho");
		
		studentLee.addBookList("�¹���1");
		studentLee.addBookList("�¹���2");

		
		studentKim.addBookList("����1");
		studentKim.addBookList("����2");
		studentKim.addBookList("����3");
		
		studentCho.addBookList("�ظ�����1");
		studentCho.addBookList("�ظ�����2");
		studentCho.addBookList("�ظ�����3");
		studentCho.addBookList("�ظ�����4");
		studentCho.addBookList("�ظ�����5");
		studentCho.addBookList("�ظ�����6");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
