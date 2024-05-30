package loop;

public class ForDemo4 {

	public static void main(String[] args) {
		/*
		 * break와 continue
		 * 
		 *break
		 * switch문을 제외하고는 반복문 안에서만 사용 가능
		 * 반복문 혹은 switch문을 탈출할 때 사용한다.
		 * 
		 *continue
		 * 반복문에서만 사용할 수 있다.
		 * 반복문에서 다음번 반복을 수행하러 증강식으로 이동한다.
		 * 
		 */

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 6) {
				break;
			}
		}
	}
}