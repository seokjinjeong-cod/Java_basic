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
		System.out.println(taxi + "의 승객은" + passengerCount + "명 이고, 수입은 " + money + "입니다.");
	}
	
	
}
