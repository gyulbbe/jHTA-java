package operator;

public class OpDemo8 {

	public static void main(String[] args) {
		//삼항연산자(조건연산자)
		/*
		 * 조건식 ? 값1 : 값2;
		 *	조건식이 true로 판정되며 최종 결과는 값1
		 *	조건식이 false로 판정되면 최종 결과는 값2
		 *	* 값1과 값2는 같은 타입이어야 한다. 단, 아래와 같이 형변환이 가능하다면 타입이 달라도 된다.
		 *	ex) double x = true ? 10 : 10.0; //정상
		 *	int y = true ? 10 : 3.14;		//컴파일 오류
		 *
		 *	배송비 유료/무료 안내하기
		 *	주문금액이 3만원 이상이면 배송비 무료, 미만은 유료
		 */
		
		int orderPrice = 15000;
//		String message = orderPrice >= 30000 ? "배송비무료" : "배송비부담";
		int delivery = orderPrice >= 30000 ? 0 : 2500;
		
		System.out.println("주문금액: " + orderPrice + "원");
		System.out.println("배송비: " + delivery + "원");
		System.out.println("결재금액: " + (orderPrice + delivery) + "원");
		
	}
}