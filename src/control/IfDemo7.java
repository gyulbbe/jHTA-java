package control;

public class IfDemo7 {

	public static void main(String[] args) {
		/*
		 * 학점계산하기
		 * 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외 F
		 */
		int score = 95;
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
//		추천하지 않는 코드
//		if (score >= 90) {
//			System.out.println("A");
//		}
//		if (score >= 80 && score < 90) {
//			System.out.println("B");
//		}
//		if (score >= 70 && score < 80) {
//			System.out.println("C");
//		}
//		if (score >= 60 && score < 70) {
//			System.out.println("D");
//		}
//		if (score < 60) {
//			System.out.println("F");
//		}
		
		/*
		 * 특정 데이터에 대해서 체크할 조건이 여러 개인 경우
		 * if ~ else if ~ else 구문을 사용하자
		 * 
		 * if구문으로 분리된 조건들은 매번 모든 조건을 체크한다.
		 * if ~ else if 구문은 true로 판정되는 조건이 발견되면 이후의 모든 조건은 무시한다.
		 * 코드 실행 성능이 개선된다.
		 */
	}
}