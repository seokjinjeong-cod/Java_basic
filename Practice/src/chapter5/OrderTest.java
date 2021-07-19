package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNum = 202107190001L;
		order.customerID = "abc123";
		order.orderDate = "2021년 7월 19일";
		order.customerName = "정석진";
		order.itemNum = "PD5485-65";
		order.address = "대구시 동구 율하동";
		
		order.showOrderInfo();
	}

}
