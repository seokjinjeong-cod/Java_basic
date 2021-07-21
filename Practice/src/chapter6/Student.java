package chapter6;

import java.util.ArrayList;

public class Student {

	String StudentName;
	ArrayList<Book> bookList;
	
	public Student(String StudentName) {
		this.StudentName = StudentName;

		bookList = new ArrayList<Book>();
	}
	
	public void addBookList(String name) {
		Book book = new Book(name);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(StudentName + " �л��� ���� å�� : ");
		for(Book book : bookList) {
			
			System.out.print(book.getName() + " ");
		}
		System.out.println(" �Դϴ�.");
	}
}
