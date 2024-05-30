package practice1;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * 사용자 정보를 저장할 수 있는 변수를 생성하고, 값을 할당한 다음 출력하세요.
		 *  - 아이디, 이름, 이메일, 전화번호, 나이, 키, 몸무게를 저장할 수 있는 변수를 생성한 다음
		 *  각각의 변수에 본인의 정보를 저장하고 출력하세요.
		 */
		String id = "asd";
		String name = "한결";
		String email = "gyul@gmail.com";
		String phoneNumber = "010-0000-0000";
		int age = 30;
		int height = 180;
		int weight = 65;
		
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("email: " + email);
		System.out.println("phoneNumber: " + phoneNumber);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		System.out.println("weight: " + weight);
		
		//사칙연산에 참여하지 않는 숫자는 String으로, 참여하는 숫자는 정수형으로
	}
}
