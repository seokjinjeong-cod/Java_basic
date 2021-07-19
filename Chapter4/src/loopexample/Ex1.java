package loopexample;

public class Ex1 {

	public static void main(String[] args) {
	
	int i;
	int j;
	
	for (i= 1; i < 10; i++) {
		
		if((i % 2) != 0) continue;
		
		for(j = 1; j < 10; j++) {
			if(j > i) break;
			System.out.println(i + "X" + j + "=" + i * j);
		}
		System.out.println();

	}
}
}
