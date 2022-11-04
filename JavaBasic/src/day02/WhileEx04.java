package day02;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
//		정수를 입력받는다.
//		입력받은 정수까지의 합. (1->5) (1->10) (1->1000)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수> ");
		int num = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num) {
			// i의 합
			sum += i;
			i++;	
		}
		
		System.out.println(num + "까지의 합: " + sum );
		
	}
	
}
