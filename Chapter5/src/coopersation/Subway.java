package coopersation;

public class Subway {
	
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "ȣ�� ����ö�� �°���" + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
