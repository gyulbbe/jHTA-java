package loop;

public class ForDemo12 {

	public static void main(String[] args) {
		
		/*
		 * 무한루프
		 * for(;;){
		 * 		수행문;
		 * }
		 * 초기식, 조건식, 증감식을 생략하면 무한루프에 빠진다.
		 */
		
		/*
		 * for문의 초기식에서 생성한 변수는 조건식, 증감식, for문의 블록내에서만 사용이 가능하다.
		 * 반복이 완료되면 즉시 사라진다.
		 */
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i);
//		}
//		System.out.println(i); //오류
		
		//for문의 초기식은 생략할 수 있다.
		int i = 1;
		for(;i <= 10; i++) {
			System.out.println(i);
		}
		
		//for문의 증감식은 생략할 수 있다.
		for(int j=1; j <= 10;) {
			System.out.println(j);
			j++;
		}
		
		//조건식을 생략하면 무한루프에 빠진다.
		for(int k=1; ; k++) {
			System.out.println(k);
		}
		
		
	}
}