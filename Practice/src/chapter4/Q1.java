package chapter4;

public class Q1 {

	public static void main(String[] args) {

		char cal = '+';
		int a = 6;
		int b = 3;
		
		int result = 0;
		
		if(cal == '+') {
			result = a+b;
		}
		else if(cal == '-') {
			result = a-b;
		}
		else if (cal == '*') {
			result = a*b;
		}
		else if (cal == '*') {
			result = a/b;
		}
		else {
			System.out.println("연산자 오류입니다.");
		}
		System.out.println("결과값은 " + result + "입니다.");
		
		
	}

}
