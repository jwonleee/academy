package quiz01;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * 정수1> 적기
		 * 연산을 선택하세요[+, -, *, /]> 적기
		 * 정수2> 적기
		 * 두 수의 뺄셈은: -5~ 이런식으로 결과
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1>");
		int a = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String b = scan.next(); // 이름 oper로 하면됨.
		
		System.out.print("정수2>");
		int c = scan.nextInt();
		
		
		switch(b) {
			
		case "+":
			System.out.println("두 수의 덧셈은: " + (a+c));
			break;
			
		case "-":
			System.out.println("두 수의 뺄셈은: " + (a-c));
			break;
			
		case "*":
			System.out.println("두 수의 곱셈은: " + (a*c));
			break;
			
		case "/":
			System.out.println("두 수의 몫은: " + (a/c));
			break;
			
		default:
			System.out.println("[+, -, *, /]을 입력하세요");
			break;
			
		}
		
	}
}
