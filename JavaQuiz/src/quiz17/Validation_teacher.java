package quiz17;

import java.nio.file.attribute.AclEntry;
import java.util.Arrays;

public class Validation_teacher {
	/* 문제1
	 * 주민번호 검증메서드 masking(String)
	 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
	 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
	 * 
	 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
	 * 2. 13자리가 아니거나, 남,여(1,2,3,4) 가 아니라면 throws처리합니다.
	 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
	 * 4. 남, 여에 대한 정보를 출력해줍니다.
	 *  
	 * masking메서드를 만들어주세요 
	 * 검증데이터 950101-1000000 -> 남자
	 * 검증데이터 9501012000000 -> 여자
	 * 검증데이터 950101-5000000 -> 예외
	 * 검증데이터 9501015000000 -> 예외
	 * 검증데이터 950101511111 -> 예외
	 */
	
	public static void main(String[] args) {
		
		Validation_teacher v = new Validation_teacher(); 
		
		try {
			System.out.println(v.masking("950101-1234567"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main의 끝
	
	
	public static String masking(String s) throws Exception {
			
		s = s.replace("-","");

//		남자, 여자 출력		
		if(s.length() != 13) {
			throw new Exception();
		} else {
			switch (s.charAt(6)) {
			case '1' :
			case '3' :
				System.out.println("남자");
				break;
			case '2' :
			case '4' :
				System.out.println("여자");
				break;
                                                                                           			default :
				throw new Exception(); //1~4가 아닌 다른 값
			}
		}
		return s.substring(0,6) + "-" + "*".repeat(7);
	}
	
}
