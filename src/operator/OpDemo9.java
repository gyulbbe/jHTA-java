package operator;

public class OpDemo9 {

	public static void main(String[] args) {
		// 비트연산자
		/*
		 * & | ! ^
		 * 	비트연산자의 연산 대상은 숫자
		 * 
		 */
		int num1 = 4;
		int num2 = 7;
		
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		// ^는 num1과 num2가 달라야만 1
		int result3 = num1 ^ num2;
		int result4 = num1 >> 2;
		int result5 = num1 << 2;
		int result6 = num1 >>> 2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}