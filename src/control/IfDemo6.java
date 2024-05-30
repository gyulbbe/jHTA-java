package control;

public class IfDemo6 {

	public static void main(String[] args) {

		//		내포된 if문
		//		if (조건식1) {
		//			// 조건식1이 true로 판정되면 블록내의 수행문이 실행된다.
		//			if (조건식2) {
		//				// 조건식1이 true로 판정되고, 조건식2도 true로 판정되면 블록내의 수행문이 실행된다.
		//			} else {
		//				// 조건식1이 true로 판정되고, 조건식2는 false로 판정되면 블록내의 수행문이 실행된다.
		//			}
		//		}

		//		if (조건식1) {
		//			// 조건식1이 true로 판정되면 블록내의 수행문이 실행된다.
		//		} else {
		//			// 조건식1이 false로 판정되면 블록내의 수행문이 실행된다.
		//			if (조건식2) {
		//				// 조건식1이 false로 판정되고, 조건식2가 true로 판정되면 블록내의 수행문이 실행된다.
		//			}
		//		}

		//국어, 영어, 수학 점수로 평균을 계산하기
		//평균이 60점 이상이라면 "합격입니다."를 출력
		//그 외는 "불합격입니다."를 출력
		//만약 평균이 95점 이상이면 "장학금지급대상입니다."를 출력

		int kor = 90;
		int eng = 100;
		int math = 100;
		int average = (kor + eng + math)/3;
		
		//이건 합격이라는 메시지는 나오지 않음
		//				if (average >= 95) {
		//					System.out.println("장학금지급대상입니다.");
		//				} else if(average >= 60) {
		//					System.out.println("합격입니다.");
		//				} else {
		//					System.out.println("불합격입니다.");
		//				}

		//이건 둘다 나오지만 else를 무조건 들러야 함
		//		if (average >= 60) {
		//			System.out.println("합격입니다.");
		//		} else {
		//			System.out.println("불합격입니다.");
		//		}
		//
		//		if (average >= 95) {
		//			System.out.println("장학금지급대상입니다.");
		//		}

		//불합격한 애들을 체크하지 않는 경제적인 코드
		if (average >= 60) {
			System.out.println("합격입니다.");
			if (average >= 95) {
				System.out.println("장학금지급대상입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
}