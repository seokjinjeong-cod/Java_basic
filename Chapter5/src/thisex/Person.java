package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("정석진", 25);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age);
	}
	
	public Person getSelf() {
		return this;
	}

}
