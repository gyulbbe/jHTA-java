package control;

public class IfDemo3 {

	public static void main(String[] args) {
		
//		if (조건식1) {
//			// 조건식1이 true로 판정되면 블록내의 수행문이 실행된다.
//		} else if (조건식2) {
//			// 조건식2가 true로 판정되면 블록내의 수행문이 실행된다.
//		} else if (조건식3) {
//			// 조건식3이 true로 판정되면 블록내의 수행문이 실행된다.
//		} else {
//			// 위에서 제시한 조건식1, 조건식2, 조건식3이 전부 false로 판정되면 블록내의 수행문이 실행된다.
//		}

		/*
		 * 고객의 등급에 따라 포인트 지급하기
		 * 등급	포인트
		 * 1	구매금액의 10%
		 * 2	구매금액의 7%
		 * 3	구매금액의 3%
		 * 그 외	구매금액의 0.5%
		 */
		
		int grade = 2;
		int orderPrice = 100000;
		int point = 0;
		
		if (grade == 1) {
			point = (int)(orderPrice*0.1);
		} else if (grade == 2) {
			point = (int)(orderPrice*0.07);
		} else if (grade == 3) {
			point = (int)(orderPrice*0.03);
		} else {
			point = (int)(orderPrice*0.005);
		}
		
		System.out.println("포인트: " + point);
	}
}
