package practice1;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * 학생의 성적을 계산하고 출력하기
		 * 학생이름, 국어점수, 영어점수, 수학점수를 입력받았다.
		 * 총점, 평균을 계산해서 이름, 점수 모두 출력하시오.
		 * 평균은 실수로 출력하시오.
		 */
		String name = "홍길동";
		int korScore = 100;
		int engScore = 80;
		int mathScore = 100;
		int sum = korScore + engScore + mathScore;
		double average = sum/3.0; //3으로 해도 출력은 .0이 붙어 마치 실수로 제대로 된 것 처럼 보이긴 함.
		
		System.out.println(name);
		System.out.println(korScore);
		System.out.println(engScore);
		System.out.println(mathScore);
		System.out.println(sum);
		System.out.println(average);
	}
}
