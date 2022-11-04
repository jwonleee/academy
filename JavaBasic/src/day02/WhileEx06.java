package day02;

public class WhileEx06 {

	public static void main(String[] args) {
		
//		배열과 반복문
//		시작은 0 ~ 길이미만
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0; // 누적
		int i = 0; // 인덱스 0부터 시작
		while(i < arr.length) { // i <= arr.length - 1 (이하)
			
//			System.out.println(i); 인덱스 값 0...9
//			System.out.println(arr[i]); 배열 안에 있는 값 1...10
			sum += arr[i]; // 배열 안의 반복문의 총 합 1+...+10
			
			i++;
		}
		
		System.out.println("배열요소의 합: " + sum);
		
	}
}
