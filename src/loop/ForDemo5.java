package loop;

public class ForDemo5 {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지의 정수들의 합계를 계산했을 때, 목표한 숫자를 초과하는 순간의 최종 숫자와 합계를 구하시오
		 */
		int i;
		int total = 0;
		int limit = 300;
		int number = -1; //왜 -1로 지정했을까?

		for(i = 1; i <= 100; i++) {
			total += i;
			if(total > limit) {
				number = i;
				break;
			}
		}
		System.out.println("합계: " + total);
		System.out.println("최종 숫자: " + number);
	}
}