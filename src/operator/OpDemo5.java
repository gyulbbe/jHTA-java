package operator;

public class OpDemo5 {

	public static void main(String[] args) {
		//비교 연산자
		/*
		 * >, >=, <, <=, ==, !=
		 *  * 비교연산자의 연산결과는 언제나 booklean 타입의 값이다.
		 */
		
		boolean result1 = 100>10;
		boolean result2 = 100<10;
		boolean result3 = 100==10;
		boolean result4 = 100!=10;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		/*
		 * - 프로그램은 업무로직을 처리하는 작업이다.
		 * - 업무로직은 다양한 조건에 대한 검사를 수행하고, 검사결과가 true인지, false 인지에 따라서 적절한 작업을 수행하는 것이다.
		 * - 따라서, 프로그램에서 비교 연산자는 특정한 작업을 수행하기 위한 조건에 맞는지 틀린지를 확인하기 위한 필수 연산이다.
		 */
		
		// 국어, 영어, 수학점수를 입력 받아서, 합격여부를 출력하기
		// 합격기준은 평균 60점 이상이다. 과목과락은 없다.
		int korScore= 70;
		int engScore= 80;
		int mathScore= 50;
		boolean isPassed;
		
		int average = (korScore + engScore + mathScore)/3;
		isPassed = average >= 60;
		
		System.out.println("합격여부: " + isPassed);
	}
}
