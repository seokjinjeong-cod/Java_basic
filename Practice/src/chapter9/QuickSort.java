package chapter9;

public class QuickSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending() {
		System.out.println("QuickSort descending");
	}

	public void description() {
		Sort.super.description();
		System.out.println("QuickSort¿‘¥œ¥Ÿ.");
	}
}
