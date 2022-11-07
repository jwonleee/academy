package day01;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
//		배열은 선언, 생성, 초기화 과정을 거칩니다.
//		1. 배열의 선언
		int[] arr;
		
//		2. 배열의 생성
		arr = new int[5];
		
		System.out.println(arr); // 주소값(위치) [I@1ee0005 나옴
		
//		3. 배열의 초기화
		// arr[인덱스] = 값; 순서==인덱스
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// arr[5] = 60; 마지막 상자는 없으니까 error
		
//		4. 배열의 사용
		System.out.println("arr 첫번째 상자: " + arr[0]); // 10
		System.out.println("arr 두번째 상자: " + arr[1]); // 20
		System.out.println("arr 세번째 상자: " + arr[2]); // 30
		System.out.println("arr 네번째 상자: " + arr[3]); // 40
		System.out.println("arr 다섯번째 상자: " + arr[4]); // 50
		
//		5. 배열의 모습을 문자열과 확인하는 명령문
		System.out.println( Arrays.toString(arr) );
		
//		6. 배열의 길이를 확인하는 명령어. length
		System.out.println("배열의 크기: " + arr.length );
		
//		7. 배열의 선언과 생성을 동시에 (초기화 안함)
		byte[] arr2 = new byte[10];
		System.out.println( Arrays.toString(arr2) ); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//		배열의 초기값을 지정하지 않으면 각 타입의 기본값으로 자동 초기화
//		0, 0.0, null
		
//		8. 배열의 선언, 생성, 초기화를 동시에
		int [] arr3 = {1,2,3,4,5,6,7,8};
		System.out.println( Arrays.toString(arr3) ); // [1, 2, 3, 4, 5, 6, 7, 8]
		
		
		System.out.println("----------------------------------------");
		
		/*
		 * 1. 스트링 배열을 생성하고 월, 화, 수, 목을 저장
		 * 
		 * 2. 크기가 3인 int배열을 생성하고 1~10 중 랜덤값을 저장.
		 */

		String[] day = new String[4];
		day[0] = "월";
		day[1] = "화";
		day[2] = "수";
		day[3] = "목";
		
//		혹은 String[] arr4 = {"월", "화", "수", "목"];
		
		System.out.println(day[0]);
		System.out.println(day[1]);
		System.out.println(day[2]);
		System.out.println(day[3]);
		
		
		int[] arr4 = new int[3];
		arr4[0] = (int)((Math.random() * 10) + 1 ); // ( 랜덤 * 10 ) +1 
		arr4[1] = (int)((Math.random() * 10) + 1 ); 
		arr4[2] = (int)((Math.random() * 10) + 1 ); 
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
//		혹은 System.out.println( Arrays.toString(arr4) );
		
	}
}
