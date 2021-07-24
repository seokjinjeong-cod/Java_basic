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
		MyDate date = (MyDate)obj;
		if(obj instanceof MyDate) {
			if(this.day == date.day && this.month == date.month && this.year == date.year) {
				return true;
			}else {
				return false;
			}
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return day*10 + month*100 + year*1000;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(24, 7, 2021);
		MyDate date2 = new MyDate(24, 7, 2021);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
