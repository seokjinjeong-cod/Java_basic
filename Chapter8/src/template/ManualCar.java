package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("�����ڰ� ���� �����մϴ�.");
		System.out.println("�����ڰ� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�����ڰ� �극��ũ�� ��� �����մϴ�.");
	}

}
