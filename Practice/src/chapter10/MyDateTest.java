package chapter10;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		MyDate md = (MyDate) obj;
		if(obj instanceof MyDate) {
			if(this.day == md.day && this.month == md.month && this.year == md.year) {
				return true;
			}else {
				return false;
			}
		}else
			return false;
	}

	@Override
	public int hashCode() {
		return day + month + year;
	}
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(25, 7, 2021);
		MyDate date2 = new MyDate(25, 7, 2021);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
	}

}
