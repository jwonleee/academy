package quiz17;

import java.nio.file.attribute.AclEntry;
import java.util.Arrays;

public class Validation {
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
		
		Validation v = new Validation(); 
		
		try {
			v.masking("950101-1234567");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main의 끝
	
	
	public static void masking(String s) throws Exception {
			
		String result = s.substring(7, 14);

		String result2 = s.replace(result, "*******");
		System.out.println(result2);

		char a = s.replace("-", "").charAt(6);

//		남자, 여자 출력		
		if((s.replace("-","").length() == 13) && (a == '1' || a == '3')) {
			System.out.println("남자");	
		} else if ((s.replace("-","").length() == 13) && (a == '2' || a == '4')) {
			System.out.println("여자");
		}

//		오류 출력
		if (s.replace("-","").length() != 13) {
			throw new Exception("숫자 개수 맞춰주세요");
		} else if (a != '1' && a != '2' && a != '3' && a != '4')
			throw new Exception("잘못 입력");
	
	}
	
	
		

	
}
