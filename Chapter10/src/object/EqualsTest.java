package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	} 

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			if(this.studentNum == std.studentNum) 
				return true;
			else
				return false;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return studentNum;
	}	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
//		Student studentLee = new Student(1000, "이순신");
//		Student studentLee2 = studentLee;
//		Student studentSun = new Student(1000, "이순신");
//		
//		System.out.println(studentLee == studentSun);
//		System.out.println(studentLee.equals(studentSun));
//		
//		System.out.println(studentLee.hashCode());
//		System.out.println(studentSun.hashCode());
//		
		Integer i1 = 10000;
		Integer i2 = 10000;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
