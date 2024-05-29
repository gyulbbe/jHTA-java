package operator;

public class OpDemo7 {

	public static void main(String[] args) {
		//논리 연산자의 실행 특징
		/*
		 * 논리곱
		 * 	비교식1 && 비교식2
		 * 	* 비교식1이 false로 판정되면 비교식2를 판정하지 않고 최종 연산결과를 false로 판정한다.
		 * 논리합
		 * 	비교식1 || 비교식2
		 * 	* 비교식1이 true로 판정되면 비교식2를 판정하지 않고 최종 연산결과를 true로 판정한다.
		 */
		
		int a= 10;
		int b= 20;
		
		boolean result = a > 5 || b++ > 10;
		
		System.out.println(result);
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		
		/*
		 * warning!
		 * 	논리연산자로 구성된 식에서 변수의 값을 변경하는 코드를 함께 사용하지 말자!
		 * 	why? 위의 예시처럼 연산결과에 영향을 미치기 때문에 예측하기가 힘들다.
		 * 
		 * 위의 코드는 아래처럼 바꾸자
		 * 
		 * ++b;
		 * boolean result = a > 5 || b > 10;
		 * 이런 식으로 분리를 시키자
		 */
	}
}