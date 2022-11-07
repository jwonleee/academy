package day10.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
//		입력과 예외처리
//		0을 입력하기 전까지 숫자를 입력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try { // 예외 발생 가능성이 있는 코드
				System.out.print(">");
//			1. int num = Integer.parseInt( scan.nextLine() ); // nextLine은 엔터값을 포함해서 다시 받아줌
				int num = scan.nextInt(); // 정수를 받음 (문자 입력하면 프로그램 멈춤, 예외, 에러 발생)
				
				if(num == 0) break; //
				
			// try 내부의 코드에서 에러 발생시 예외를 받아옴(catch가 실행되는 동안 프로그램 멈추지 않음)
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
//			2. scan = new Scanner(System.in); // 내풀이
				scan.nextLine(); // 3. 엔터개행을 제거

			}
			
		}
	}
}

