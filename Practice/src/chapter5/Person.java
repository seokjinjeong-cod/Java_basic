package chapter5;

public class Person {

	int age;
	String name;
	boolean isMarried;
	int numbersOfChildren;
	
	public void showPersonInfo() {
		System.out.println("나이: " + age +
				"\n이름: " + name +
				"\n결혼여부: " + isMarried +
				"\n자녀수: " + numbersOfChildren);
	}
	
}
