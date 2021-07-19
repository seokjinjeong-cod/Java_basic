package chapter5;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.age = 40;
		person.name = "james";
		person.isMarried = true;
		person.numbersOfChildren = 3; 
		
		person.showPersonInfo();
		
	}

}
