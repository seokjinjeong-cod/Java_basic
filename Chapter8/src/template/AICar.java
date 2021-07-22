package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("차량이 스스로 방향을 제어합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 제동합니다.");
	}

}
