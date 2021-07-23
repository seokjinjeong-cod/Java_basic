package chapter9;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'q' || ch == 'Q') {
			sort = new QuickSort();
		} else if(ch == 'b' || ch == 'B') {
			sort = new BubbleSort();
		} else if(ch == 'H' || ch == 'H') {
			sort = new HeapSort();
		} else {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		sort.ascending();
		sort.descending();
		sort.description();
	}
}
