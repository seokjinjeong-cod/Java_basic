package coopersation;

public class Taxi {
	
	String taxi;
	int passengerCount;
	int money;
	
	public Taxi(String taxi) {
		this.taxi = taxi;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxi + "�� �°���" + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
	
	
}
