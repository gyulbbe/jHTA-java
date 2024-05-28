package var;

import java.util.Date;

public class VarDemo7 {

	public static void main(String[] args) {
		
		// 문자열
		/*
		 * 문자열이란?
		 *  - 문자열은 한 글자 이상의 문자로 구성된다.
		 *  - 문자열은 String객체로 표현된다.
		 *  - 문자열 리터럴은 "쌍따옴표"로 표현한다.
		 *  - 문자열은 빈문자열, 공백문자, 탭문자 등을 포함할 수 있다.
		 *  - 문자열을 생성하고 참조변수로 참조하기
		 *  	String x = "홍길동";
		 *  	1. 문자열 "홍길동"을 표현하는 String 객체가 힙영역에 생성된다.
		 *  	2. 참조변수 x가 메모리의 스택영역에 생성된다.
		 *  	3. 생성된 String 객체의 주소값이 참조변수 x에 대입된다.
		 *  	4. 참조변수가 x가 String 객체를 참조한다.
		 *  	5. 참조변수 x를 사용해서 참조하는 String객체의 공개된 기능을 사용할 수 있다.
		 */
		
		String str = "Hello, World!";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.isEmpty());
		
		Date now = new Date();
		System.out.println(now.getTime());
		//유닉스 타임(운영체제 이름) - 1초에 1000번 바뀜
	}
}