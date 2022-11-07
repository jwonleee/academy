package quiz16;

import java.util.Scanner;

public class Calculator {
	
	public static int input() throws Exception {
		/*
		 * 1. 스캐너 정수 2개를 입력을 받습니다.
		 * 2. 입력된 값이 정수라면 합계를 반환합니다.
		 * 3. 예외가 발생할 수 있는 상황이라면 throw를 이용해서 메서드를 종료하고 예외메시지를 전달해주면 됩니다
		 * 4. scan.close() 는 finally 문장에서 사용하세요
		 * 합계반환, 에러메시지
		 */
		
//		Scanner scan = null; 변수를 밖에 선언, 지역변수는 초기화가 필수
//		try안에 scan = new Scanner(System.in); 아래와 같음
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("정수 입력1> ");
			int a = scan.nextInt();
			System.out.println("정수 입력2> ");
			int b = scan.nextInt();

			int sum = 0;
			sum = a + b;
			System.out.println("정수 합계: " + sum);
			return sum;
			
		} catch (Exception e) {
			throw new Exception("정수로 입력해라"); // 예외생성, throw문제가 생기면서 input()옆에 throws Exception 추가
			
		} finally {
			scan.close();
			System.out.println("입력을 종료");
		}

	}
}
