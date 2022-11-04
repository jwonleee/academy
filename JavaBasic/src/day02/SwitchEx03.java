package day02;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
//		System.out.println(arr[]);
		/*
		 * Math.random()을 사용하여 배열의 인덱스 범위(0~3)까지 랜덤수를 만듭니다.
		 * 랜덤수를 배열의 index의 적용해서 출력된 단어가
		 * 한국어, 영어, 일본어, 알수없는언어
		 * 인지 처리를 해보세요.
		 */
		
		
		int num = (int)(Math.random() * 4);
		System.out.println("선택된 단어: " + arr[num]);
		
		// 정수, 문자여야 합니다.
		switch(arr[num]) {
		case "안녕" :
			System.out.println("한국어");
			break;
		case "hello":
			System.out.println("영어");
			break;
		case "사요나라" :	
			System.out.println("일본어");
			break;
		default :
			System.out.println("알 수 없는 언어");
			break;
		}
		
		/* 오답
		 * String[] l = new String [num];
		
		l[num] = "한국어";
		l[num] = "영어";
		l[num] = "일본어";
		l[num] = "알수없는언어";
		
		System.out.println(l[num]);
		
		 */
	}
}
