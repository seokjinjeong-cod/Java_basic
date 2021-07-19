package classpart;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	
	public void showSutdentinfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		
		Student studentJeong = new Student();
		studentJeong.studentName = "Á¤¼®Áø";
		studentJeong.showSutdentinfo();
	}
	

}
