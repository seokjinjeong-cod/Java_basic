package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(1010, "�̼���");
		Customer customerShin = new Customer(1020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(1030, "ȫ�浿");
		Customer customerYul = new GoldCustomer(1040, "������");
		Customer customerKim = new VIPCustomer(1050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("============�� ���� ���============");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("============�������� ���ʽ� ����Ʈ ���============");
		
		for(Customer customer : customerList) {
			int price = 10000;
			System.out.println(customer.customerName + "���� " + customer.calcPrice(price) + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.customerName + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�");
			
		}
	}
}
