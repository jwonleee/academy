package day01;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
//		1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름> "); //print니까 옆으로 입력됨
		String name = scan.next(); //문자열을 입력받고 name 변수에 저장
		
//		scan.next(),scan.nextInt()등은 커서가 대기 상태 -> 문자를 받을때까지 기다림
		
		System.out.print("나이> ");
		int age = scan.nextInt();
		
		System.out.println("입력된 이름: " + name);
		System.out.println("입력된 나이: " + age);
		
		scan.close(); // 스캐너 지원 끝! (단, 닫으면 이후에 scanner 사용 못함)
		
	}
}
