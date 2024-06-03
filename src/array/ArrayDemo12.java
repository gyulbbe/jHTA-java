package array;

import java.util.Arrays;

public class ArrayDemo12 {

	public static void main(String[] args) {
		
		/*
		 * 배열에서 값 검색하기
		 * 
		 * 	Arrays의 검색기능
		 *   Arrays.binarySearch(배열, 값)
		 * 		- 위의 기능은 배열에서 지정된 값이 저장된 위치를 반환한다.
		 * 		- 저장된 값을 찾지 못했을 때는 음수 값이 반환된다.
		 * 		- 배열의 오름차순으로 정렬되어 있어야 한다.
		 */
		
		String[] users = {"김유신", "강감찬", "이순신", "류관순", "홍길동"};
		Arrays.sort(users);
		
		//정렬 후 -> {"강감찬", "김유신", "류관순", "이순신", "홍길동"}
		int foundIndex = Arrays.binarySearch(users, "이순신");
		
		System.out.println("인덱스: " + foundIndex);
	}
}