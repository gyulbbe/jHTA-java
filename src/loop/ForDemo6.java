package loop;

public class ForDemo6 {

	public static void main(String[] args) {
		
		//continue
		for(int i = 1; i <= 10; i++) {
			if(i == 6) {
				//continue가 실행되면 System.out.println(i); 수행문을 실행하지 않고, 증감식으로 이동해서 다음번 반복을 수행한다.
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		//continue 대체 방법
		for(int i = 1; i <= 10; i++) {
			if(i != 6) {
				System.out.println(i);
			}
		}
	}
}