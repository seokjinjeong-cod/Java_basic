package chapter9;

public class HeapSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending() {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort�Դϴ�.");
	}
}
