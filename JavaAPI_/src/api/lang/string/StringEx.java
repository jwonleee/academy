package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길동";
		
		char a = s.charAt(0);
		System.out.println(a);
		
//		길 문자를 찾으면 위치반환, 못찾으면 -1반환
		int index = s.indexOf("길");
		System.out.println("길 시작위치: " + index);
		
//		replace - 원본문자는 유지
//		s = s.replace("길", ""); 이렇게하면 원본문자 바뀜
		String result = s.replace("길", "");
		System.out.println("결과: "+ result);
		
		System.out.println("원본문자열: " + s);
		
//		subString - 인덱스 기준으로 절삭, 추출
		String s2 = "오늘은 날씨가 추워요";
		String result2 = s2.substring(4);
		System.out.println("결과: " + result2); // 4미만 절삭
	
		String result3 = s2.substring(4, 7);
		System.out.println(result3); // 4이상 7미만 추출
	
//		trim - 앞뒤공백제거
		System.out.println("      홍길동".trim()    );
		
//		split - 문자열 자르기
		String[] result4 = s2.split(" ");
		System.out.println(Arrays.toString(result4)); // [오늘은, 날씨가, 추워요]
		
//		split - 매개변수 2개 주면 배열의 크기 제한
		String[] result5 = "010-1234-5678".split("-", 2);
		System.out.println(Arrays.toString(result5)); // [오늘은, 날씨가, 추워요]
		
//		contains - 문자열 포함여부
		if(s.contains("홍")) {
			System.out.println("홍 이 포함됨");
		}
		
//		String.valueOf - 기본값 → 문자열 변환
		String result6 = String.copyValueOf(new char[] {'a', 'b', 'c'}); // 변수 안주고, 매개변수에 배열 요소를 {}에 적음
		System.out.println(result6); // abc
		
		String result7 = String.valueOf(2);
		System.out.println("문자열 바뀐 결과: " + result7 + 3); // 23
		
	}
}
