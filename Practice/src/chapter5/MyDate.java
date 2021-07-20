package chapter5;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year= year;
	}
	
	public boolean isValid() {
		if(day > 0 && day < 32 && month > 0 && month < 13 && year > 0) {
			System.out.println("유효한 날짜입니다.");
			return true;
		}
		else {
			System.out.println("유효한 날짜가 아닙니다.");
			return false;
		}
	}

}
