package _java.quiz;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		end: while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int num = scan.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("예금액> ");
					int deposit = scan.nextInt();
					balance += deposit;
					break;
				case 2: 
					System.out.println("출금액> ");
					int withdrawal = scan.nextInt();
					balance -= withdrawal;
					
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4: 
					scan.close();
					break end;
					// 혹은 run = false;
					// break;
				default:
					System.out.println("1~4번 중에서 입력하세요!!!");
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
