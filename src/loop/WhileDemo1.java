package loop;

import java.util.StringTokenizer;

public class WhileDemo1 {

	public static void main(String[] args) {
		/*
		 * while (조건식){
		 * 		수행문;
		 * }
		 * 
		 * 제시된 조건식이 true인 경우 수행문을 반복해서 실행한다.
		 * 제시된 조건식이 false로 판정되면 반복을 중단한다.
		 * 
		 * while문은 개발자가 반복의 횟수를 지정하는 것이 아니라,
		 * 반복작업의 대상이 되는 객체가 반복을 지속할지 여부를 알려준다.
		 * 따라서, while문은 반복작업이 지원되고,
		 * 반복지속여부를 알려주는 기능이 제공되는 객체와 같이 사용된다.
		 * 
		 * 대표적인 객체
		 * 	ex) Iterator<E>, Enumeration<E>, StringTokenizer, ResultSet
		 * 
		 * StringTokenizer
		 * 		문자열을 잘라서 토큰으로 가지고 있는 객체다.
		 * 		* token: 의미를 가지는 최소 단위의 문자열
		 * 		- 주요 기능
		 * 			boolean hasMoreTokens()
		 * 				객체에 남은 토큰이 있으면 true를 반환
		 * 			String nextToken()
		 * 				객체에서 토큰을 하나 꺼내서 제공한다.
		 */
		
		StringTokenizer st = new StringTokenizer("김유신,강감찬,이순신", ",");
		while (st.hasMoreTokens()) { //hasMoreTokens()는 흔들어서 다음 객체 있나 확인해보기
			System.out.println(st.nextToken());
		}
		
		//이렇게 소리가 나는(다음 객체가 있다는 것을 알려주는) 기능이 있는 객체와 함께 사용해야 한다.
	}
}