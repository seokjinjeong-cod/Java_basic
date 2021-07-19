package chapter5;

public class Order {

	long orderNum;
	String customerID;
	String orderDate;
	String customerName;
	String itemNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호:" + orderNum);
		System.out.println("주문자 아이디:" + customerID);
		System.out.println("주문 날짜:" + orderDate);
		System.out.println("주문자 이름:" + customerName);
		System.out.println("주문 상품 번호:" + itemNum);
		System.out.println("배송 주소:" + address);
	}
}


