package loop;

public class ForDemo2 {

	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아서 해당 범위에 포함된 모든 정수를 합계를 구해서 계산하기
		 * 
		 * 두번재 수는 첫번째 수보다 크거나 같다.
		 */
		
//		int num1 = 21;
//		int num2 = 37;
//		int total = 0;
//		
//		for(int i = num1; i <= num2; i++) {
//			total += i;
//		}
//		
//		System.out.println(total);

		int num1 = 1_000_000_001;
		int num2 = 1_000_000_003;
		int total = 0;
		
		for(int i = num1; i <= num2; i++) {
		total += i;
	}
		
	System.out.println(total);
	//오버플로우 때문에 음수
	}
}