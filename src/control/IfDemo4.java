package control;

public class IfDemo4 {

	public static void main(String[] args) {
		/*
		 * 고객 등급과 구매 금액에 따른 포인트 및 배송비, 최종결재금액 계산하기
		 * 
		 * 포인트 지급조건
		 * 1등급	구매금액의 10%
		 * 2등급	구매금액의 7%
		 * 3등급	구매금액의 3%
		 * 4등급	구매금액의 0.5%
		 * 
		 * 배송비 계산조건
		 * 3000원 미만	2500원
		 * 그 외			0원
		 */
	
		int grade = 1;
		int orderPrice = 5000;
		int deliveryPrice = 0;
		int point= 0;
		
		if (grade == 1) {
			point = (int) (orderPrice*0.1);
		} else if (grade == 2) {
			point = (int) (orderPrice*0.07);
		} else if (grade == 3) {
			point = (int) (orderPrice*0.03);
		} else {
			point = (int) (orderPrice*0.005);
		}
		
		if (orderPrice < 30000) {
			deliveryPrice = 2500;
		}
		
		System.out.println("최종결재금액: " + (orderPrice + deliveryPrice));
		System.out.println("배송비: " + deliveryPrice);
		System.out.println("포인트: " + point);
	}
}