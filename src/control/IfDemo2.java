package control;

public class IfDemo2 {

	public static void main(String[] args) {
		
//		if (조건식) {
//			// 조건식이 true로 판정되면 블록내의 수행문이 실행된다.
//		} else {
//			// 조건식이 false로 판정되면 블록내의 수행문이 실행된다.
//		}
		
		//국어, 영어, 수학점수를 입력 받아서 평균이 60점 이상이면 "합격입니다."를 출력하고, 그 외에는 "불합격입니다."를 출력한다.
		int kor = 60;
		int eng = 80;
		int math = 80;
		
		int average = (kor + eng + math)/3;
		
		System.out.println(average);
		
		if (average>60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
