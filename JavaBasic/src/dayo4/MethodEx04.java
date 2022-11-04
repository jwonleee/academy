package dayo4;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		String[] arr2 = {"월", "화", "수"};
		
		
		method01(arr); // 변수명 or 생성구문
		
		method02(arr, arr2);
		
		int[] arr3 = method03(); // return이 있는 메서드는 반드시 반환을 해줘야 함
		
//		String[] arr4 = "str".split("");
		
	} // end main

//	정수 배열을 매개변수로 받는 메서드
	static void method01(int[] a) {
//		a를 이용해서 배열밗의 사용 가능
		System.out.println( Arrays.toString(a) );
	}
	
//	정수 배열과 문자열 배열을 매개변수로 받는 메서드
	static int method02(int[] arr, String[] arr2) {
		for(int a : arr) {
			System.out.println(a);
		}
		return 0;
	}

//	배열을 반환하는 메서드
	static int[] method03() {
		
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		return arr;
	}
	
	
	
	
	
}
