package thread;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("ÅÂ¹é»ê¸Æ1");
		books.add("ÅÂ¹é»ê¸Æ2");
		books.add("ÅÂ¹é»ê¸Æ3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		while(books.size() == 0) {
			System.out.println(t.getName() + "waiting start");
			wait();
			System.out.println(t.getName() + "waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		System.out.println(t.getName() + ":" + title + " return");
	}
}

class Student extends Thread{
	
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return;
			sleep(5000);
			LibraryMain.library.returnBook(title);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {

		Student Lee = new Student();
		Student Kim = new Student();
		Student Joo = new Student();
		Student Park = new Student();
		Student Choi = new Student();
		Student Bae = new Student();
		
		Lee.start();
		Kim.start();
		Joo.start();
		Park.start();
		Choi.start();
		Bae.start();
		
	}

}
