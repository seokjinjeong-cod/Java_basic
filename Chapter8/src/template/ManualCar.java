package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("운전자가 직업 주행합니다.");
		System.out.println("운전자가 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("운전자가 브레이크를 밟아 제동합니다.");
	}

}
