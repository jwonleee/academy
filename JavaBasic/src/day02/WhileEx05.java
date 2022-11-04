package day02;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		
		/*
		 * 반복문 안에서의 입력 		
		 * 
		 * 1개의 정수를 받아서 반복의 횟수 결정
		 * 횟수에 맞게 입력
		 * 입력받은 수들의 누적
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반복횟수> ");
		int num = scan.nextInt();
		
		int sum = 0; // 누적할 변수
		int i = 1;
		while(i <= num) {
			
			System.out.print("> ");
			int a = scan.nextInt();
//			System.out.println(a); 확인하려고 적은 것
			
			sum += a; // 입력받은 수의 누적
			
			i++;
		}
		
		System.out.println(sum);
		
	}
}
