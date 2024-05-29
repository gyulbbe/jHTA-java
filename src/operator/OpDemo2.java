package operator;

public class OpDemo2 {

	public static void main(String[] args) {
		
		//로또 번호
		/*
		 * 1. 시스템의 현재 유닉스타임값을 조회한다.
		 * 	long unixTime = System.currentTimeMillis();
		 * 	*유닉스 타임값은 long타입의 정수다.
		 * 2. 유닉스타임값을 나머지연산자(%)로 나머지를 구한다.
		 * 	unixTime%45
		 * 3. 계산결과로 획득된 값을 int 타입으로 형변환 시킨다.
		 * 	(int)(unixTime%45)
		 * 	*(int)0L --> 0
		 */
		
		long unixTime = System.currentTimeMillis();
		System.out.println("유닉스 시간: " + unixTime);
		
		int diceNumber = (int)unixTime%6 + 1;
		System.out.println(diceNumber);
	}
}