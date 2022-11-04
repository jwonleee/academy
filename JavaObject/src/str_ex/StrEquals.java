package str_ex;

public class StrEquals {

	public static void main(String[] args) {
		
		String str1 = "홍길자";
		String str2 = "홍길자";
		String str3 = new String("홍길자");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		/*
		 * 같은 클래스 내부에서 문자열을 선언하면 동일한 위치를 참조한다 (동일한 문자)
		 * 하지만, 다른 클래스에서 넘어오는 String은 다른 위치를 가지게 됩니다.
		 * 
		 * 그래서 문자열 비교시에는 == 대신에 String 클래스가 제공해주는 equals()를 사용합니다.
		 */
		
		System.out.println( str1.equals(str3) ); // true
	}
}
