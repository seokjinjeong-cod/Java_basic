package polymorphism;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ��" + agentID + "�Դϴ�.";
	}

	public int getAgentID() {
		return agentID;
	}
}
