package chapter9;

public interface Sort {

	void ascending();
	void descending();
	
	default void description(){
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}	
}
