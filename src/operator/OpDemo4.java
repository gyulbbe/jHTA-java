package operator;

public class OpDemo4 {

	public static void main(String[] args) {
		//증감 연산자
		/*
		 * ++ --
		 * * 증감 연산자의 변수의 값을 1씩 증가 혹은 감소시킨다.
		 * * 증감 연산자는 단항연산자다.
		 * * 증감 연산자는 변수에만 사용할 수 있다.
		 * ++10; // 오류
		 * * 증감 연산자는 변수 앞에 혹은 변수의 뒤에 적을 수 있다.
		 * ++a; a++;
		 */
		
		int a= 10;
		a++;
		a++;
		System.out.println(a);

		int num1= 3;
		int num2= 3;
		int x= ++num1;
		int y= num2++;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}