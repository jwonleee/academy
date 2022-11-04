package day03;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
//		문자열 다루기
//		String str = new String(new char[] {'A', 'B', 'C'});
//		System.out.println(str);

		String str = "안녕하세요~";
			
//		문자열의 길이를 확인
		System.out.println(str.length());
		int len = str.length();
		System.out.println(len);
		
//		문자열을 한글자 자르기 charAt(인덱스)
		char c = str.charAt(5); // 5번 자리에 인덱스 값 넣음
		System.out.println(c); // 0안, 1녕, 2하, 3세, 4요, 5~
		
		// char c = alp.charAt(0); 
		// int b = a.charAt(0);    이거 두개처럼 바꿔줄때도 사용
		
//		문자열의 위치 확인 indexOf, lastIndexOf - 찾는 문자의 위치 반환
		
		int a = str.indexOf("녕");
		System.out.println("찾은 위치: " + a);
		int b = str.lastIndexOf("녕");
		System.out.println("찾은 위치: " + b);
		int d = str.indexOf("sdf");
		System.out.println("찾는 문자가 없다면: " + d); // -1
		
//		문자열 변경 - replace
		String e = str.replace("안", "헐"); // 안 -> 헐 (전부다)
		System.out.println(e); // 헐녕하세요~
		System.out.println(str); // 안녕하세요~, 원본문자는 그대로 유지
		
//		대소문자 변경 - toUpperCase, toLowerCase
		str = "abcDeFg";
		String f = str.toUpperCase();
		System.out.println(f); // ABCDEFG, 원본문자 str은 유지
		
//		공백 제거 - trim or replace
		str = "   010-1234-5678   ";
		String g = str.trim();
		System.out.println(g); // 010-1234-5678, 앞뒤 공백제거
		System.out.println(str); // 원본문자는 그대로 유지
		
		str = "안 녕 하 세 요 개 천 절 날 은 쉽니다    ";
		String h = str.replace(" ","");
		System.out.println(h);
		
//		String.valueOf() -> 기본타입을 문자로 변경
		System.out.println( String.valueOf(10) + 20);
		
//		문자열 자르기★
//		subString - 인덱스 기준으로 자름
//		split - 특정 문자 기준으로 잘라서 배열로 담아줌
//		toCharArray - 하나씩 뜯어서 다 char로 담아줌
		
	
		str = "010-1234-5657";
		
		String i = str.substring(3); // 인덱스 미만 절삭, -1234-5657
		System.out.println(i);
		
		String j = str.substring(3, 5); // 인덱스 이상 ~ 인덱스 미만 추출, -1
		System.out.println(j);
		
		String[] arr = str.split("-"); // [010, 1234, 5657], str.split("");이건 한글자씩 쪼갬
		System.out.println(Arrays.toString(arr));
		
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2)); // [0, 1, 0, -, 1, 2, 3, 4, -, 5, 6, 5, 7]
		
		
	}
}
