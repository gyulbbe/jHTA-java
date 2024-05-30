package control;

public class IfDemo5 {

	public static void main(String[] args) {
		
		/*
		 * 구매금액에 따른 배송비 계산하기 
		 * 30,000원 미만은 배송비 2500원을 추가한다.
		 */

		int orderPrice = 10000;
		int deliverPrice = 0;
		
		if (orderPrice < 30000) {
			deliverPrice = 2500;
		}
		
		System.out.println("주문금액: " + orderPrice);
		System.out.println("배송비: " + deliverPrice);
		System.out.println("결재금액: " + (orderPrice + deliverPrice));
	}
}