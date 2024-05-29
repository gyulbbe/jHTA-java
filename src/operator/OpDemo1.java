package operator;

public class OpDemo1 {

	public static void main(String[] args) {
		//산술 연산자
		int num1=20;
		int num2=6;
		int num3=3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1 + num2*num3);
		// *,/,%는 붙여서 +,-는 띄워서 적기
		
		//덧셈 연산자
		/*
		 * 숫자 + 숫자				<- 더하기 기능
		 * 숫자 + "문자열"			<- 연결 기능
		 * "문자열" + 숫자			<- 연결 기능
		 * "문자열1" + "문자열2"	<- 연결 기능
		 * 
		 * 기능이 더하기 기능과 이어붙이기 기능 두 가지가 존재한다.
		 * 연결하기 연산의 실행결과는 언제나 문자열이다.
		 */
		
		System.out.println(10 + 20);
		System.out.println(10 + "10");
		System.out.println("10" + 10 + 30); //결과:101030
		System.out.println(10 + 30 + "10"); //결과:4010
		System.out.println(10 + 'a');
	}
}