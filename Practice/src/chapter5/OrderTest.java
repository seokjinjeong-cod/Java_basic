package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNum = 202107190001L;
		order.customerID = "abc123";
		order.orderDate = "2021�� 7�� 19��";
		order.customerName = "������";
		order.itemNum = "PD5485-65";
		order.address = "�뱸�� ���� ���ϵ�";
		
		order.showOrderInfo();
	}

}
