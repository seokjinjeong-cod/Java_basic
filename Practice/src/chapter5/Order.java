package chapter5;

public class Order {

	long orderNum;
	String customerID;
	String orderDate;
	String customerName;
	String itemNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("�ֹ���ȣ:" + orderNum);
		System.out.println("�ֹ��� ���̵�:" + customerID);
		System.out.println("�ֹ� ��¥:" + orderDate);
		System.out.println("�ֹ��� �̸�:" + customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ:" + itemNum);
		System.out.println("��� �ּ�:" + address);
	}
}


