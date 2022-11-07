package _api.util.arrays;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String [] arr = {"카리나", "아이린", "윈터", "조이", "슬기"};

		// 배열을 순회하면서 출력
		for(String singer: arr) {
			System.out.println(singer); //카리나 / 아이린 /	윈터 / 조이 /	슬기
		}
		 
		// 문자열의 크기 비교하는 메서드: compareTo, compareToIgnorecase
		 System.out.println(arr[1].compareTo(arr[0])); // -2352

		//선택 정렬
		// 배열의 복제
		String[] copyArr = Arrays.copyOf(arr, arr.length);
		
		// 첫번째부터 n-1번째 데이터 까지
		for(int i = 0; i < copyArr.length; i++) {
			// 자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyArr.length; j++ ) {
				// 뒤에 있는 데이터가 더 크다면(작다면) 교환
				if(copyArr[i].compareTo(copyArr[j]) < 0 ) {
					String tmp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(copyArr)); // [카리나, 조이, 윈터, 아이린, 슬기]
	}
}
