package _api.util.arrays;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String[] singers = {"제니", "지수", "로제", "리사"};
		
		// 이분 검색 수행 - sort를 하지 않아서 잘못된 결과가 리턴됨
		int result = Arrays.binarySearch(singers, "로제");
		System.out.println(result); // -1
		
		// 데이터 정렬
		Arrays.sort(singers);
		// 정렬한 데이터 확인
		System.out.println(Arrays.toString(singers)); // [로제, 리사, 제니, 지수]
		int result2 = Arrays.binarySearch(singers, "로제");
		System.out.println(result2); // 0
		if(result2 >= 0) {
			System.out.printf("%s는 %d번째 존재\n", "로제", (result2+1)); // 로제는 1번째 존재로 바꿔서 이해할 수 있게끔
		} else {
			System.out.printf("%s는 존재하지 않음\n", "로제");
		}
	
	}
}
