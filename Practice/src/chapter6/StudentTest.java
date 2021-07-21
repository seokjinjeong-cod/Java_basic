package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		Student studentCho = new Student("Cho");
		
		studentLee.addBookList("태백산맥1");
		studentLee.addBookList("태백산맥2");

		
		studentKim.addBookList("토지1");
		studentKim.addBookList("토지2");
		studentKim.addBookList("토지3");
		
		studentCho.addBookList("해리포터1");
		studentCho.addBookList("해리포터2");
		studentCho.addBookList("해리포터3");
		studentCho.addBookList("해리포터4");
		studentCho.addBookList("해리포터5");
		studentCho.addBookList("해리포터6");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
