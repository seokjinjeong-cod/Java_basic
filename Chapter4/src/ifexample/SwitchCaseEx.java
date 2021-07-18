package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
			case 2: day = 28;
				break;
			default : day = 31;
		}
		
		System.out.println( month + "월은 "  + day + "일까지 있습니다.");
	}

}
