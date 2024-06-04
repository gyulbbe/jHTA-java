package array;

import java.util.Arrays;

public class ArrayDemo17 {

	public static void main(String[] args) {
		/*
		 * 로또번호 추첨하기
		 * 
		 * 1 ~ 45 사이의 정수 중에서 숫자 6개를 뽑아서 만든다.
		 *  - 숫자는 중복을 혀용하지 않는다.
		 *  - 최종 결과는 숫자를 오름차순으로 정렬해서 출력한다.
		 *  - 보너스 숫자는 로또 번호 6개와 다른 번호로 뽑는다.
		 *  
		 * 구현내용
		 *  1. 숫자 7개를 담는 정수형 배열을 정의한다.
		 *  2. 로또번호를 뽑는다.
		 *   - 1 ~ 45 사이의 임의의 정수를 생성한다.
		 *   - 배열에 같은 숫자가 있는지 확인한다.
		 *   - 동일한 숫자가 존재하지 않으면 그 숫자를 배열에 저장한다.
		 *   - 숫자 7개가 전부 채워지면 반복문을 탈출한다.
		 *  3. 로또 번호를 저장할 배열을 생성한다.
		 *   - 보너스 번호를 저장할 변수를 정의한다.
		 *  4. 1번에서 생성한 배열에서 0 ~ 5번째 값을 로또 배열에 복사한다.
		 *   - 로또 배열에 저장된 값을 오름차순으로 정렬한다.
		 *  5. 1번에서 생성한 배열의 6번째 값을 보너스 번호 변수에 대입하다.
		 *  6. 로또 번호와 보너스 번호를 출력한다.
		 */
		
		//1. 숫자 7개를 담은 정수형 배열을 생성한다.
		int[] arr = new int[7];
		
		//2. 반복작업 시작
		//3. 배열에 값을 저장할 위치를 나타내는 변수를 생성한다.
		int savePosition = 0;
		while(true) {
			//4. 1 ~ 45 사이의 임의의 정수를 뽑는다.
			//난수란? 실행할 때 마다 다른 숫자가 나오는 것
			//0 <= Math.random() < 1 -> 0 <= Math.random()*45 + 1<= (1 * 45) + 1
			int number = (int)(Math.random()*45 + 1);
//			System.out.println(number);
			//5. 배열에 뽑은 숫자와 동일한 숫자가 저장되어 있는지 확인하기
			//5-1. 중복여부를 나타내는 변수를 생성한다.
			boolean isExist = false;
			//5-2. 배열에 저장된 값들과 숫자를 비교한다.
			for(int value : arr) {
				//5-3. 배열에서 하나씩 뽑아낸 값이 0이면 더이상 비교할 필요가 없으므로 탈출
				if(value == 0) {
					break;
				}
				
				//5-4. 배열에서 하나씩 뽑아낸 값과 숫자를 비교해서 일치히면 isExist변수에 true를 대입하고, 탈출한다.
				if (value == number) {
					isExist = true;
					break;
				}
			}
			
			//6. 중복여부가 false면 뽑은 정수를 배열에 저장하기
			if(!isExist) {
				arr[savePosition] = number;
				savePosition++; // 저장할 위치를 1증가시킨다.
			}
			
			//7. 배열에 숫자가 7개 저장되었으면 탈출한다.
			if(savePosition == 7) {
				break;
			}
		}
		
		//8. 로또 번호를 담는 배열과 보너스 번호를 담은 변수를 생성한다.
//		int[] lotto = {arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]};
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = arr[i]; 
		}
		int bonus = arr[6];
		
		//9. 로또 번호를 오름차순으로 정렬한다.
		Arrays.sort(lotto);
		
		//10.로또 번호와 보너스 번호를 출력한다.
		System.out.println("보너스 번호: " + bonus);
		System.out.println("로또 번호: " + Arrays.toString(lotto));
		
	}
}