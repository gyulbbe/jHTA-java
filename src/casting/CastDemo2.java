package casting;

public class CastDemo2 {

	public static void main(String[] args) {
		//정수와 문자간의 형변환
		int num1='A';
		System.out.println(num1);

		int num2='가';
		System.out.println(num2);
		
//		int num3="가";
//		System.out.println(num3);
		//""이건 String 객체이기 때문에 안됨 why? 속성과 기능을 모두 가지고 있기 때문에 그걸 표현할 수 없음
		
		char ch1=65;
		char ch2=1000;
		System.out.println(ch1);
		System.out.println(ch2);
	}
}