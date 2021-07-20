package chapter5;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(22, 5, 2020);
		date1.isValid();
		MyDate date2 = new MyDate(5, 5, 2020);
		date2.isValid();
	}

}
