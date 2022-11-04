package day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 * 변수는 선언과 초기화 과정이 있습니다.
		 * 선언방법
		 * 타입 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 타입
		 * String은 문자열을 저장하는 대표적인 타입
		 * 
		 */
		
		int num;
		num = 10;
//		초기화
		
		System.out.println(num);
		
//		선언과 초기화를 동시에
		int num2 = 20;
		System.out.println(num2);
		
//		변수의 값을 변경
		num2 = 100;
		System.out.println(num2);
		
//		변수에는 다른 변수의 값을 넣을 수도 있습니다.
		int result = num2;
		System.out.println(result);
		
//		변수에는 연산의 결과도 저장할 수 있습니다.
		int result2 = num + num2;
		System.out.println(result2); //110
		
//		문자열을 저장
		String str = "10";
		System.out.println(str);
		
//		변수는 타입이 다르면 바로 저장할 수 없음.
//		int num3 = str; 
		
		
		
		
		
		
		
		
		
	}
}
